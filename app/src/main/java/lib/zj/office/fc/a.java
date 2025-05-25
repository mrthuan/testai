package lib.zj.office.fc;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;
import java.util.List;
import lib.zj.office.fc.hpsf.DocumentSummaryInformation;
import lib.zj.office.fc.hpsf.HPSFException;
import lib.zj.office.fc.hpsf.MutablePropertySet;
import lib.zj.office.fc.hpsf.PropertySet;
import lib.zj.office.fc.hpsf.PropertySetFactory;
import lib.zj.office.fc.hpsf.SummaryInformation;
import lib.zj.office.fc.hpsf.WritingNotSupportedException;
import lib.zj.office.fc.poifs.filesystem.DirectoryEntry;
import lib.zj.office.fc.poifs.filesystem.DirectoryNode;
import lib.zj.office.fc.poifs.filesystem.Entry;
import lib.zj.office.fc.poifs.filesystem.NPOIFSFileSystem;
import lib.zj.office.fc.poifs.filesystem.POIFSFileSystem;
import lib.zj.office.fc.util.Internal;
import lib.zj.office.fc.util.POILogFactory;
import lib.zj.office.fc.util.POILogger;
import lib.zj.office.fc.util.POIUtils;

/* compiled from: POIDocument.java */
/* loaded from: classes3.dex */
public abstract class a {
    private static final POILogger logger = POILogFactory.getLogger(a.class);
    protected DirectoryNode directory;
    private DocumentSummaryInformation dsInf;
    private boolean initialized;
    private SummaryInformation sInf;

    public a(DirectoryNode directoryNode) {
        this.initialized = false;
        this.directory = directoryNode;
    }

    @Internal
    @Deprecated
    public void copyNodeRecursively(Entry entry, DirectoryEntry directoryEntry) {
        POIUtils.copyNodeRecursively(entry, directoryEntry);
    }

    @Deprecated
    public void copyNodes(POIFSFileSystem pOIFSFileSystem, POIFSFileSystem pOIFSFileSystem2, List<String> list) {
        POIUtils.copyNodes(pOIFSFileSystem, pOIFSFileSystem2, list);
    }

    public void createInformationProperties() {
        if (!this.initialized) {
            readProperties();
        }
        if (this.sInf == null) {
            this.sInf = PropertySetFactory.newSummaryInformation();
        }
        if (this.dsInf == null) {
            this.dsInf = PropertySetFactory.newDocumentSummaryInformation();
        }
    }

    public DocumentSummaryInformation getDocumentSummaryInformation() {
        if (!this.initialized) {
            readProperties();
        }
        return this.dsInf;
    }

    public PropertySet getPropertySet(String str) {
        DirectoryNode directoryNode = this.directory;
        if (directoryNode == null) {
            return null;
        }
        try {
            try {
                return PropertySetFactory.create(directoryNode.createDocumentInputStream(directoryNode.getEntry(str)));
            } catch (IOException e10) {
                POILogger pOILogger = logger;
                int i10 = POILogger.WARN;
                pOILogger.log(i10, "Error creating property set with name " + str + "\n" + e10);
                return null;
            } catch (HPSFException e11) {
                POILogger pOILogger2 = logger;
                int i11 = POILogger.WARN;
                pOILogger2.log(i11, "Error creating property set with name " + str + "\n" + e11);
                return null;
            }
        } catch (IOException e12) {
            POILogger pOILogger3 = logger;
            int i12 = POILogger.WARN;
            pOILogger3.log(i12, "Error getting property set with name " + str + "\n" + e12);
            return null;
        }
    }

    public SummaryInformation getSummaryInformation() {
        if (!this.initialized) {
            readProperties();
        }
        return this.sInf;
    }

    public void readProperties() {
        PropertySet propertySet = getPropertySet(DocumentSummaryInformation.DEFAULT_STREAM_NAME);
        if (propertySet != null && (propertySet instanceof DocumentSummaryInformation)) {
            this.dsInf = (DocumentSummaryInformation) propertySet;
        } else if (propertySet != null) {
            logger.log(POILogger.WARN, "DocumentSummaryInformation property set came back with wrong class - ", propertySet.getClass());
        }
        PropertySet propertySet2 = getPropertySet(SummaryInformation.DEFAULT_STREAM_NAME);
        if (propertySet2 instanceof SummaryInformation) {
            this.sInf = (SummaryInformation) propertySet2;
        } else if (propertySet2 != null) {
            logger.log(POILogger.WARN, "SummaryInformation property set came back with wrong class - ", propertySet2.getClass());
        }
        this.initialized = true;
    }

    public abstract void write(OutputStream outputStream);

    public void writeProperties(POIFSFileSystem pOIFSFileSystem) {
        writeProperties(pOIFSFileSystem, null);
    }

    public void writePropertySet(String str, PropertySet propertySet, POIFSFileSystem pOIFSFileSystem) {
        try {
            MutablePropertySet mutablePropertySet = new MutablePropertySet(propertySet);
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            mutablePropertySet.write(byteArrayOutputStream);
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            pOIFSFileSystem.createDocument(new ByteArrayInputStream(byteArray), str);
            POILogger pOILogger = logger;
            int i10 = POILogger.INFO;
            pOILogger.log(i10, "Wrote property set " + str + " of size " + byteArray.length);
        } catch (WritingNotSupportedException unused) {
            PrintStream printStream = System.err;
            printStream.println("Couldn't write property set with name " + str + " as not supported by HPSF yet");
        }
    }

    @Deprecated
    public void copyNodes(DirectoryNode directoryNode, DirectoryNode directoryNode2, List<String> list) {
        POIUtils.copyNodes(directoryNode, directoryNode2, list);
    }

    public void writeProperties(POIFSFileSystem pOIFSFileSystem, List<String> list) {
        SummaryInformation summaryInformation = getSummaryInformation();
        if (summaryInformation != null) {
            writePropertySet(SummaryInformation.DEFAULT_STREAM_NAME, summaryInformation, pOIFSFileSystem);
            if (list != null) {
                list.add(SummaryInformation.DEFAULT_STREAM_NAME);
            }
        }
        DocumentSummaryInformation documentSummaryInformation = getDocumentSummaryInformation();
        if (documentSummaryInformation != null) {
            writePropertySet(DocumentSummaryInformation.DEFAULT_STREAM_NAME, documentSummaryInformation, pOIFSFileSystem);
            if (list != null) {
                list.add(DocumentSummaryInformation.DEFAULT_STREAM_NAME);
            }
        }
    }

    @Deprecated
    public a(DirectoryNode directoryNode, POIFSFileSystem pOIFSFileSystem) {
        this.initialized = false;
        this.directory = directoryNode;
    }

    public a(POIFSFileSystem pOIFSFileSystem) {
        this(pOIFSFileSystem.getRoot());
    }

    public a(NPOIFSFileSystem nPOIFSFileSystem) {
        this(nPOIFSFileSystem.getRoot());
    }
}
