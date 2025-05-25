package lib.zj.office.fc.hssf.eventusermodel;

import java.io.InputStream;
import lib.zj.office.fc.hssf.record.Record;
import lib.zj.office.fc.hssf.record.RecordFactoryInputStream;
import lib.zj.office.fc.poifs.filesystem.DirectoryNode;
import lib.zj.office.fc.poifs.filesystem.POIFSFileSystem;

/* loaded from: classes3.dex */
public class HSSFEventFactory {
    private short genericProcessEvents(HSSFRequest hSSFRequest, InputStream inputStream) {
        short s4 = 0;
        RecordFactoryInputStream recordFactoryInputStream = new RecordFactoryInputStream(inputStream, false);
        do {
            Record nextRecord = recordFactoryInputStream.nextRecord();
            if (nextRecord == null) {
                break;
            }
            s4 = hSSFRequest.processRecord(nextRecord);
        } while (s4 == 0);
        return s4;
    }

    public short abortableProcessEvents(HSSFRequest hSSFRequest, InputStream inputStream) {
        return genericProcessEvents(hSSFRequest, inputStream);
    }

    public short abortableProcessWorkbookEvents(HSSFRequest hSSFRequest, POIFSFileSystem pOIFSFileSystem) {
        return abortableProcessWorkbookEvents(hSSFRequest, pOIFSFileSystem.getRoot());
    }

    public void processEvents(HSSFRequest hSSFRequest, InputStream inputStream) {
        try {
            genericProcessEvents(hSSFRequest, inputStream);
        } catch (HSSFUserException unused) {
        }
    }

    public void processWorkbookEvents(HSSFRequest hSSFRequest, POIFSFileSystem pOIFSFileSystem) {
        processWorkbookEvents(hSSFRequest, pOIFSFileSystem.getRoot());
    }

    public short abortableProcessWorkbookEvents(HSSFRequest hSSFRequest, DirectoryNode directoryNode) {
        return abortableProcessEvents(hSSFRequest, directoryNode.createDocumentInputStream("Workbook"));
    }

    public void processWorkbookEvents(HSSFRequest hSSFRequest, DirectoryNode directoryNode) {
        processEvents(hSSFRequest, directoryNode.createDocumentInputStream("Workbook"));
    }
}
