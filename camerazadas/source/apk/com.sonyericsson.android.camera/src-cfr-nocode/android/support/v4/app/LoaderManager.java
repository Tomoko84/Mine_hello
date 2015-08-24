/*
 * Decompiled with CFR 0_100.
 */
package android.support.v4.app;

import android.os.Bundle;
import android.support.v4.content.Loader;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/*
 * Exception performing whole class analysis ignored.
 */
public abstract class LoaderManager {
    public LoaderManager();

    public static void enableDebugLogging(boolean var0);

    public abstract void destroyLoader(int var1);

    public abstract void dump(String var1, FileDescriptor var2, PrintWriter var3, String[] var4);

    public abstract <D> Loader<D> getLoader(int var1);

    public boolean hasRunningLoaders();

    public abstract <D> Loader<D> initLoader(int var1, Bundle var2, LoaderCallbacks<D> var3);

    public abstract <D> Loader<D> restartLoader(int var1, Bundle var2, LoaderCallbacks<D> var3);

    public static interface LoaderCallbacks<D> {
        public Loader<D> onCreateLoader(int var1, Bundle var2);

        public void onLoadFinished(Loader<D> var1, D var2);

        public void onLoaderReset(Loader<D> var1);
    }

}

