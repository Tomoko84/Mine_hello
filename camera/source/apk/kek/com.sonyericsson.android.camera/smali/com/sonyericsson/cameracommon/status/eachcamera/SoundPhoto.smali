.class public Lcom/sonyericsson/cameracommon/status/eachcamera/SoundPhoto;
.super Lcom/sonyericsson/cameracommon/status/EnumValue;
.source "SoundPhoto.java"

# interfaces
.implements Lcom/sonyericsson/cameracommon/status/EachCameraStatusValue;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/sonyericsson/cameracommon/status/eachcamera/SoundPhoto$Value;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/sonyericsson/cameracommon/status/EnumValue",
        "<",
        "Lcom/sonyericsson/cameracommon/status/eachcamera/SoundPhoto$Value;",
        ">;",
        "Lcom/sonyericsson/cameracommon/status/EachCameraStatusValue;"
    }
.end annotation


# static fields
.field public static final DEFAULT_VALUE:Lcom/sonyericsson/cameracommon/status/eachcamera/SoundPhoto$Value;

.field public static final KEY:Ljava/lang/String; = "sound_photo"

.field private static final REQUIRED_VERSION:I = 0xa


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 25
    sget-object v0, Lcom/sonyericsson/cameracommon/status/eachcamera/SoundPhoto$Value;->OFF:Lcom/sonyericsson/cameracommon/status/eachcamera/SoundPhoto$Value;

    sput-object v0, Lcom/sonyericsson/cameracommon/status/eachcamera/SoundPhoto;->DEFAULT_VALUE:Lcom/sonyericsson/cameracommon/status/eachcamera/SoundPhoto$Value;

    return-void
.end method

.method public constructor <init>(Lcom/sonyericsson/cameracommon/status/eachcamera/SoundPhoto$Value;)V
    .locals 0
    .param p1, "val"    # Lcom/sonyericsson/cameracommon/status/eachcamera/SoundPhoto$Value;

    .prologue
    .line 51
    invoke-direct {p0, p1}, Lcom/sonyericsson/cameracommon/status/EnumValue;-><init>(Ljava/lang/Enum;)V

    .line 52
    return-void
.end method


# virtual methods
.method public getKey()Ljava/lang/String;
    .locals 1

    .prologue
    .line 56
    const-string v0, "sound_photo"

    return-object v0
.end method

.method public minRequiredVersion()I
    .locals 1

    .prologue
    .line 61
    const/16 v0, 0xa

    return v0
.end method
