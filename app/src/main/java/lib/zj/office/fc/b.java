package lib.zj.office.fc;

/* compiled from: POITextExtractor.java */
/* loaded from: classes3.dex */
public abstract class b {
    protected a document;

    public b(a aVar) {
        this.document = aVar;
    }

    public abstract b getMetadataTextExtractor();

    public abstract String getText();

    public b(b bVar) {
        this.document = bVar.document;
    }
}
