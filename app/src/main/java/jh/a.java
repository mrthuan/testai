package jh;

import lib.zj.office.fc.openxml4j.opc.ContentTypes;

/* compiled from: Picture.java */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public byte f19230a;

    /* renamed from: b  reason: collision with root package name */
    public byte[] f19231b;
    public String c;

    /* renamed from: d  reason: collision with root package name */
    public float f19232d = 0.0f;

    public final void a(String str) {
        if (str.equalsIgnoreCase("emf")) {
            this.f19230a = (byte) 2;
        } else if (str.equalsIgnoreCase("wmf")) {
            this.f19230a = (byte) 3;
        } else if (str.equalsIgnoreCase("pict")) {
            this.f19230a = (byte) 4;
        } else if (str.equalsIgnoreCase(ContentTypes.EXTENSION_JPG_2)) {
            this.f19230a = (byte) 5;
        } else if (str.equalsIgnoreCase(ContentTypes.EXTENSION_PNG)) {
            this.f19230a = (byte) 6;
        } else if (str.equalsIgnoreCase("dib")) {
            this.f19230a = (byte) 7;
        } else if (str.equalsIgnoreCase(ContentTypes.EXTENSION_GIF)) {
            this.f19230a = (byte) 8;
        }
    }
}
