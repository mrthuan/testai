package io.flutter.plugins.pathprovider;

import android.content.Context;
import io.flutter.plugins.pathprovider.Messages;
import java.io.File;
import java.util.ArrayList;

/* compiled from: PathProviderPlugin.java */
/* loaded from: classes.dex */
public final class a implements Messages.a {

    /* renamed from: a  reason: collision with root package name */
    public Context f18831a;

    /* compiled from: PathProviderPlugin.java */
    /* renamed from: io.flutter.plugins.pathprovider.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static /* synthetic */ class C0254a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f18832a;

        static {
            int[] iArr = new int[Messages.StorageDirectory.values().length];
            f18832a = iArr;
            try {
                iArr[Messages.StorageDirectory.ROOT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f18832a[Messages.StorageDirectory.MUSIC.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f18832a[Messages.StorageDirectory.PODCASTS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f18832a[Messages.StorageDirectory.RINGTONES.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f18832a[Messages.StorageDirectory.ALARMS.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f18832a[Messages.StorageDirectory.NOTIFICATIONS.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f18832a[Messages.StorageDirectory.PICTURES.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f18832a[Messages.StorageDirectory.MOVIES.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f18832a[Messages.StorageDirectory.DOWNLOADS.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f18832a[Messages.StorageDirectory.DCIM.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f18832a[Messages.StorageDirectory.DOCUMENTS.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
        }
    }

    public final ArrayList a(Messages.StorageDirectory storageDirectory) {
        String str;
        File[] externalFilesDirs;
        ArrayList arrayList = new ArrayList();
        Context context = this.f18831a;
        switch (C0254a.f18832a[storageDirectory.ordinal()]) {
            case 1:
                str = null;
                break;
            case 2:
                str = "music";
                break;
            case 3:
                str = "podcasts";
                break;
            case 4:
                str = "ringtones";
                break;
            case 5:
                str = "alarms";
                break;
            case 6:
                str = "notifications";
                break;
            case 7:
                str = "pictures";
                break;
            case 8:
                str = "movies";
                break;
            case 9:
                str = "downloads";
                break;
            case 10:
                str = "dcim";
                break;
            case 11:
                str = "documents";
                break;
            default:
                throw new RuntimeException("Unrecognized directory: " + storageDirectory);
        }
        for (File file : context.getExternalFilesDirs(str)) {
            if (file != null) {
                arrayList.add(file.getAbsolutePath());
            }
        }
        return arrayList;
    }
}
