package lib.zj.office.fc.poifs.filesystem;

/* loaded from: classes3.dex */
public class POIFSWriterEvent {
    private String documentName;
    private int limit;
    private POIFSDocumentPath path;
    private DocumentOutputStream stream;

    public POIFSWriterEvent(DocumentOutputStream documentOutputStream, POIFSDocumentPath pOIFSDocumentPath, String str, int i10) {
        this.stream = documentOutputStream;
        this.path = pOIFSDocumentPath;
        this.documentName = str;
        this.limit = i10;
    }

    public int getLimit() {
        return this.limit;
    }

    public String getName() {
        return this.documentName;
    }

    public POIFSDocumentPath getPath() {
        return this.path;
    }

    public DocumentOutputStream getStream() {
        return this.stream;
    }
}
