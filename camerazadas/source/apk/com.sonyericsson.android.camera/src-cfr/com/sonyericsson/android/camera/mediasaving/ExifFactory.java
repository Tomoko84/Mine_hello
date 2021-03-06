/*
 * Decompiled with CFR 0_100.
 */
package com.sonyericsson.android.camera.mediasaving;

import android.location.Location;
import com.sonyericsson.android.camera.mediasaving.ExifOption;
import java.nio.charset.Charset;
import java.util.Calendar;
import java.util.Locale;
import java.util.TimeZone;

public class ExifFactory {
    private static byte[] APP1_HEADER = new byte[]{-1, -31, 3, 27, 69, 120, 105, 102, 0, 0};
    private static int APP1_LENGTH = 0;
    private static byte[] EXIF_IFD;
    private static byte[] FIRST_IFD;
    private static byte[] GPS_IFD;
    private static final int MAKER_NAME_LIMITATION = 14;
    private static final String TAG = "ExifFactory";
    private static byte[] TIFF_HEADER;
    private static byte[] ZERO_IFD;
    private static byte[] ZERO_IFD_INT;

    static {
        TIFF_HEADER = new byte[]{77, 77, 0, 42, 0, 0, 0, 8};
        ZERO_IFD = new byte[]{0, 10, 1, 15, 0, 2, 0, 0, 0, 0, 0, 0, 0, -122, 1, 16, 0, 2, 0, 0, 0, 30, 0, 0, 0, -108, 1, 18, 0, 3, 0, 0, 0, 1, 0, 6, 0, 0, 1, 26, 0, 5, 0, 0, 0, 1, 0, 0, 0, -78, 1, 27, 0, 5, 0, 0, 0, 1, 0, 0, 0, -70, 1, 40, 0, 3, 0, 0, 0, 1, 0, 2, 0, 0, 1, 50, 0, 2, 0, 0, 0, 20, 0, 0, 0, -62, 2, 19, 0, 3, 0, 0, 0, 1, 0, 1, 0, 0, -121, 105, 0, 4, 0, 0, 0, 1, 0, 0, 0, -42, -120, 37, 0, 4, 0, 0, 0, 1, 0, 0, 1, -102, 0, 0, 2, -86, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 72, 0, 0, 0, 1, 0, 0, 0, 72, 0, 0, 0, 1, 50, 48, 49, 49, 58, 48, 49, 58, 50, 51, 32, 49, 50, 58, 51, 52, 58, 53, 54, 0};
        EXIF_IFD = new byte[]{0, 9, -112, 0, 0, 7, 0, 0, 0, 4, 48, 50, 50, 48, -112, 3, 0, 2, 0, 0, 0, 20, 0, 0, 1, 84, -112, 4, 0, 2, 0, 0, 0, 20, 0, 0, 1, 104, -111, 1, 0, 7, 0, 0, 0, 4, 1, 2, 3, 0, -96, 0, 0, 7, 0, 0, 0, 4, 48, 49, 48, 48, -96, 1, 0, 3, 0, 0, 0, 1, 0, 1, 0, 0, -96, 2, 0, 4, 0, 0, 0, 1, 0, 0, 12, -64, -96, 3, 0, 4, 0, 0, 0, 1, 0, 0, 0, 0, -96, 5, 0, 4, 0, 0, 0, 1, 0, 0, 1, 124, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 50, 48, 49, 49, 58, 48, 49, 58, 50, 51, 32, 49, 50, 58, 51, 52, 58, 53, 54, 0, 50, 48, 49, 49, 58, 48, 49, 58, 50, 51, 32, 49, 50, 58, 51, 52, 58, 53, 54, 0};
        ZERO_IFD_INT = new byte[]{0, 2, 0, 1, 0, 2, 0, 0, 0, 4, 82, 57, 56, 0, 0, 2, 0, 7, 0, 0, 0, 4, 48, 49, 48, 48, 0, 0, 0, 0};
        GPS_IFD = new byte[]{0, 12, 0, 0, 0, 1, 0, 0, 0, 4, 2, 2, 0, 0, 0, 1, 0, 2, 0, 0, 0, 2, 78, 0, 0, 0, 0, 2, 0, 5, 0, 0, 0, 3, 0, 0, 2, 48, 0, 3, 0, 2, 0, 0, 0, 2, 69, 0, 0, 0, 0, 4, 0, 5, 0, 0, 0, 3, 0, 0, 2, 72, 0, 5, 0, 1, 0, 0, 0, 1, 0, 0, 0, 0, 0, 6, 0, 5, 0, 0, 0, 1, 0, 0, 2, 96, 0, 7, 0, 5, 0, 0, 0, 3, 0, 0, 2, 104, 0, 9, 0, 2, 0, 0, 0, 2, 65, 0, 0, 0, 0, 18, 0, 2, 0, 0, 0, 7, 0, 0, 2, -128, 0, 27, 0, 7, 0, 0, 0, 0, 0, 0, 2, -118, 0, 29, 0, 2, 0, 0, 0, 11, 0, 0, 2, -98, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 87, 71, 83, 45, 56, 52, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 50, 48, 49, 49, 58, 48, 49, 58, 50, 51, 0, 0};
        FIRST_IFD = new byte[]{0, 7, 1, 3, 0, 3, 0, 0, 0, 1, 0, 6, 0, 0, 1, 18, 0, 3, 0, 0, 0, 1, 0, 6, 0, 0, 1, 26, 0, 5, 0, 0, 0, 1, 0, 0, 3, 4, 1, 27, 0, 5, 0, 0, 0, 1, 0, 0, 3, 12, 1, 40, 0, 3, 0, 0, 0, 1, 0, 2, 0, 0, 2, 1, 0, 4, 0, 0, 0, 1, 0, 0, 3, 20, 2, 2, 0, 4, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 72, 0, 0, 0, 1, 0, 0, 0, 72, 0, 0, 0, 1};
        APP1_LENGTH = APP1_HEADER.length + TIFF_HEADER.length + ZERO_IFD.length + EXIF_IFD.length + ZERO_IFD_INT.length + GPS_IFD.length + FIRST_IFD.length;
    }

    private static void checkArguments(byte[] arrby, ExifOption exifOption) {
        if (arrby == null || exifOption == null || exifOption.mModel == null || exifOption.mDateTime == null || exifOption.mThumbnailData == null) {
            throw new IllegalArgumentException("can not null");
        }
        if (!(exifOption.mGPSOption == null || exifOption.mGPSOption.hasAltitude())) {
            exifOption.mGPSOption.setAltitude(0.0);
        }
        if ((long)exifOption.mThumbnailData.length < exifOption.mThumbnailDataLength) {
            throw new IllegalArgumentException("thumbnail data length too big");
        }
        if ((long)arrby.length < (long)APP1_LENGTH + exifOption.mThumbnailDataLength) {
            throw new IllegalArgumentException("buffer too short");
        }
        if (exifOption.mModel.length() == 0 || exifOption.mDateTime.length() < "YYYY:MM:DD hh:mm:ss".length()) {
            throw new IllegalArgumentException("model or datetime too short");
        }
        if (exifOption.mModel.length() >= 30 || exifOption.mDateTime.length() > "YYYY:MM:DD hh:mm:ss".length()) {
            throw new IllegalArgumentException("model or datetime too long");
        }
    }

    private static void fillNullValue(byte[] arrby, int n, int n2) {
        for (int i = 0; i < n2; ++i) {
            arrby[n + i] = 0;
        }
    }

    public static int generate(byte[] arrby, ExifOption exifOption) {
        ExifFactory.checkArguments(arrby, exifOption);
        int n = ExifFactory.writeTemplate(arrby);
        ExifFactory.updateMake(arrby, exifOption.mMake);
        ExifFactory.updateModel(arrby, exifOption.mModel);
        ExifFactory.updateOrientation(arrby, exifOption.mOrientation);
        ExifFactory.updateDateTime(arrby, exifOption.mDateTime);
        ExifFactory.updatePixelXDimension(arrby, exifOption.mPixelXDimension);
        ExifFactory.updatePixelYDimension(arrby, exifOption.mPixelYDimension);
        ExifFactory.updateGpsFields(arrby, exifOption.mGPSOption);
        ExifFactory.updateJpegInterchangeFormatLength(arrby, exifOption.mThumbnailDataLength);
        System.arraycopy(exifOption.mThumbnailData, 0, arrby, n, (int)exifOption.mThumbnailDataLength);
        n = (int)((long)n + exifOption.mThumbnailDataLength);
        ExifFactory.updateExifSize(arrby, n - 2);
        return n;
    }

    public static int getLength() {
        return APP1_LENGTH;
    }

    private static void removeGpsInfoFromHeader(byte[] arrby) {
        ExifFactory.writeShortValue(arrby, APP1_HEADER.length + 8, 9);
        ExifFactory.fillNullValue(arrby, APP1_HEADER.length + 118, 11);
        ExifFactory.writeLongValue(arrby, APP1_HEADER.length + 118, 682);
        ExifFactory.fillNullValue(arrby, APP1_HEADER.length + 410, 272);
    }

    private static void updateDateTime(byte[] arrby, String string) {
        ExifFactory.writeASCIIValue(arrby, APP1_HEADER.length + 194, string);
        ExifFactory.writeASCIIValue(arrby, APP1_HEADER.length + 340, string);
        ExifFactory.writeASCIIValue(arrby, APP1_HEADER.length + 360, string);
    }

    private static void updateExifSize(byte[] arrby, int n) {
        ExifFactory.writeShortValue(arrby, APP1_HEADER.length - 8, n);
    }

    private static void updateGpsFields(byte[] arrby, Location location) {
        if (location != null && ExifFactory.writeGpsInfoToHeader(arrby, location)) {
            return;
        }
        ExifFactory.removeGpsInfoFromHeader(arrby);
    }

    private static void updateJpegInterchangeFormatLength(byte[] arrby, long l) {
        ExifFactory.writeLongValue(arrby, APP1_HEADER.length + 764, l);
    }

    private static void updateMake(byte[] arrby, String string) {
        if (string.length() > 14) {
            string = string.substring(0, 14);
        }
        int n = ExifFactory.writeASCIIValue(arrby, APP1_HEADER.length + 134, string);
        ExifFactory.writeShortValue(arrby, APP1_HEADER.length + 16, n + 1);
    }

    private static void updateModel(byte[] arrby, String string) {
        int n = ExifFactory.writeASCIIValue(arrby, APP1_HEADER.length + 148, string);
        ExifFactory.writeLongValue(arrby, APP1_HEADER.length + 26, n + 1);
    }

    private static void updateOrientation(byte[] arrby, int n) {
        ExifFactory.writeShortValue(arrby, APP1_HEADER.length + 42, n);
        ExifFactory.writeShortValue(arrby, APP1_HEADER.length + 704, n);
    }

    private static void updatePixelXDimension(byte[] arrby, long l) {
        ExifFactory.writeLongValue(arrby, APP1_HEADER.length + 308 - 12, l);
    }

    private static void updatePixelYDimension(byte[] arrby, long l) {
        ExifFactory.writeLongValue(arrby, APP1_HEADER.length + 320 - 12, l);
    }

    private static int writeASCIIValue(byte[] arrby, int n, String object) {
        object = object.getBytes(Charset.forName("US-ASCII"));
        System.arraycopy(object, 0, arrby, n, object.length);
        return object.length;
    }

    private static void writeByteValue(byte[] arrby, int n, int n2) {
        arrby[n + 0] = (byte)n2;
    }

    private static boolean writeGpsInfoToHeader(byte[] arrby, Location object) {
        double d;
        String[] arrstring;
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(object.getTime());
        double d2 = d = object.getLatitude();
        if (d < 0.0) {
            ExifFactory.writeASCIIValue(arrby, APP1_HEADER.length + 432, "S");
            d2 = - d;
        }
        try {
            arrstring = Location.convert(d2, 2);
        }
        catch (IllegalArgumentException var0_1) {
            return false;
        }
        arrstring = arrstring.split(":");
        try {
            ExifFactory.writeRationalValue(arrby, APP1_HEADER.length + 560, Long.parseLong(arrstring[0]), 1);
            ExifFactory.writeRationalValue(arrby, APP1_HEADER.length + 568, Long.parseLong(arrstring[1]), 1);
            ExifFactory.writeRationalValue(arrby, APP1_HEADER.length + 576, (long)(Float.parseFloat(arrstring[2]) * 1000.0f), 1000);
        }
        catch (NumberFormatException var0_2) {
            return false;
        }
        d2 = d = object.getLongitude();
        if (d < 0.0) {
            ExifFactory.writeASCIIValue(arrby, APP1_HEADER.length + 456, "W");
            d2 = - d;
        }
        try {
            arrstring = Location.convert(d2, 2);
        }
        catch (IllegalArgumentException var0_3) {
            return false;
        }
        arrstring = arrstring.split(":");
        try {
            ExifFactory.writeRationalValue(arrby, APP1_HEADER.length + 584, Long.parseLong(arrstring[0]), 1);
            ExifFactory.writeRationalValue(arrby, APP1_HEADER.length + 592, Long.parseLong(arrstring[1]), 1);
            ExifFactory.writeRationalValue(arrby, APP1_HEADER.length + 600, (long)(Float.parseFloat(arrstring[2]) * 1000.0f), 1000);
        }
        catch (NumberFormatException var0_4) {
            return false;
        }
        d2 = object.getAltitude();
        if (d2 < 0.0) {
            ExifFactory.writeByteValue(arrby, APP1_HEADER.length + 480, 1);
        }
        ExifFactory.writeRationalValue(arrby, APP1_HEADER.length + 608, (long)(1000.0 * d2), 1000);
        calendar.setTimeZone(TimeZone.getTimeZone("UTC"));
        try {
            ExifFactory.writeRationalValue(arrby, APP1_HEADER.length + 616, calendar.get(11), 1);
            ExifFactory.writeRationalValue(arrby, APP1_HEADER.length + 624, calendar.get(12) + 1, 1);
            ExifFactory.writeRationalValue(arrby, APP1_HEADER.length + 632, (long)calendar.get(13) * 1000, 1000);
            object = String.format(Locale.US, "%04d:%02d:%02d", calendar.get(1), calendar.get(2) + 1, calendar.get(5));
        }
        catch (IllegalArgumentException var0_5) {
            return false;
        }
        ExifFactory.writeASCIIValue(arrby, APP1_HEADER.length + 670, (String)object);
        return true;
    }

    private static void writeLongValue(byte[] arrby, int n, long l) {
        arrby[n + 0] = (byte)(l / 0x1000000);
        arrby[n + 1] = (byte)(l / 65536);
        arrby[n + 2] = (byte)(l / 256);
        arrby[n + 3] = (byte)(l % 256);
    }

    private static void writeRationalValue(byte[] arrby, int n, long l, long l2) {
        ExifFactory.writeLongValue(arrby, n + 0, l);
        ExifFactory.writeLongValue(arrby, n + 4, l2);
    }

    private static void writeShortValue(byte[] arrby, int n, int n2) {
        arrby[n + 0] = (byte)(n2 / 256);
        arrby[n + 1] = (byte)(n2 % 256);
    }

    private static int writeTemplate(byte[] arrby) {
        System.arraycopy(APP1_HEADER, 0, arrby, 0, APP1_HEADER.length);
        int n = 0 + APP1_HEADER.length;
        System.arraycopy(TIFF_HEADER, 0, arrby, n, TIFF_HEADER.length);
        System.arraycopy(ZERO_IFD, 0, arrby, n+=TIFF_HEADER.length, ZERO_IFD.length);
        System.arraycopy(EXIF_IFD, 0, arrby, n+=ZERO_IFD.length, EXIF_IFD.length);
        System.arraycopy(ZERO_IFD_INT, 0, arrby, n+=EXIF_IFD.length, ZERO_IFD_INT.length);
        System.arraycopy(GPS_IFD, 0, arrby, n+=ZERO_IFD_INT.length, GPS_IFD.length);
        System.arraycopy(FIRST_IFD, 0, arrby, n+=GPS_IFD.length, FIRST_IFD.length);
        return n + FIRST_IFD.length;
    }
}

