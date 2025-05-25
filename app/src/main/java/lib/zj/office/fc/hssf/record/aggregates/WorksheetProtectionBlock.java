package lib.zj.office.fc.hssf.record.aggregates;

import lib.zj.office.fc.hssf.model.RecordStream;
import lib.zj.office.fc.hssf.record.ObjectProtectRecord;
import lib.zj.office.fc.hssf.record.PasswordRecord;
import lib.zj.office.fc.hssf.record.ProtectRecord;
import lib.zj.office.fc.hssf.record.Record;
import lib.zj.office.fc.hssf.record.RecordFormatException;
import lib.zj.office.fc.hssf.record.ScenarioProtectRecord;
import lib.zj.office.fc.hssf.record.aggregates.RecordAggregate;

/* loaded from: classes3.dex */
public final class WorksheetProtectionBlock extends RecordAggregate {
    private ObjectProtectRecord _objectProtectRecord;
    private PasswordRecord _passwordRecord;
    private ProtectRecord _protectRecord;
    private ScenarioProtectRecord _scenarioProtectRecord;

    private void checkNotPresent(Record record) {
        if (record == null) {
            return;
        }
        throw new RecordFormatException("Duplicate PageSettingsBlock record (sid=0x" + Integer.toHexString(record.getSid()) + ")");
    }

    private static ObjectProtectRecord createObjectProtect() {
        ObjectProtectRecord objectProtectRecord = new ObjectProtectRecord();
        objectProtectRecord.setProtect(false);
        return objectProtectRecord;
    }

    private static PasswordRecord createPassword() {
        return new PasswordRecord(0);
    }

    private static ScenarioProtectRecord createScenarioProtect() {
        ScenarioProtectRecord scenarioProtectRecord = new ScenarioProtectRecord();
        scenarioProtectRecord.setProtect(false);
        return scenarioProtectRecord;
    }

    private PasswordRecord getPassword() {
        if (this._passwordRecord == null) {
            this._passwordRecord = createPassword();
        }
        return this._passwordRecord;
    }

    private ProtectRecord getProtect() {
        if (this._protectRecord == null) {
            this._protectRecord = new ProtectRecord(false);
        }
        return this._protectRecord;
    }

    public static boolean isComponentRecord(int i10) {
        if (i10 != 18 && i10 != 19 && i10 != 99 && i10 != 221) {
            return false;
        }
        return true;
    }

    private boolean readARecord(RecordStream recordStream) {
        int peekNextSid = recordStream.peekNextSid();
        if (peekNextSid != 18) {
            if (peekNextSid != 19) {
                if (peekNextSid != 99) {
                    if (peekNextSid != 221) {
                        return false;
                    }
                    checkNotPresent(this._scenarioProtectRecord);
                    this._scenarioProtectRecord = (ScenarioProtectRecord) recordStream.getNext();
                    return true;
                }
                checkNotPresent(this._objectProtectRecord);
                this._objectProtectRecord = (ObjectProtectRecord) recordStream.getNext();
                return true;
            }
            checkNotPresent(this._passwordRecord);
            this._passwordRecord = (PasswordRecord) recordStream.getNext();
            return true;
        }
        checkNotPresent(this._protectRecord);
        this._protectRecord = (ProtectRecord) recordStream.getNext();
        return true;
    }

    private static void visitIfPresent(Record record, RecordAggregate.RecordVisitor recordVisitor) {
        if (record != null) {
            recordVisitor.visitRecord(record);
        }
    }

    public void addRecords(RecordStream recordStream) {
        do {
        } while (readARecord(recordStream));
    }

    public ScenarioProtectRecord getHCenter() {
        return this._scenarioProtectRecord;
    }

    public int getPasswordHash() {
        PasswordRecord passwordRecord = this._passwordRecord;
        if (passwordRecord == null) {
            return 0;
        }
        return passwordRecord.getPassword();
    }

    public PasswordRecord getPasswordRecord() {
        return this._passwordRecord;
    }

    public boolean isObjectProtected() {
        ObjectProtectRecord objectProtectRecord = this._objectProtectRecord;
        if (objectProtectRecord != null && objectProtectRecord.getProtect()) {
            return true;
        }
        return false;
    }

    public boolean isScenarioProtected() {
        ScenarioProtectRecord scenarioProtectRecord = this._scenarioProtectRecord;
        if (scenarioProtectRecord != null && scenarioProtectRecord.getProtect()) {
            return true;
        }
        return false;
    }

    public boolean isSheetProtected() {
        ProtectRecord protectRecord = this._protectRecord;
        if (protectRecord != null && protectRecord.getProtect()) {
            return true;
        }
        return false;
    }

    public void protectSheet(String str, boolean z10, boolean z11) {
        if (str == null) {
            this._passwordRecord = null;
            this._protectRecord = null;
            this._objectProtectRecord = null;
            this._scenarioProtectRecord = null;
            return;
        }
        ProtectRecord protect = getProtect();
        PasswordRecord password = getPassword();
        protect.setProtect(true);
        password.setPassword(PasswordRecord.hashPassword(str));
        if (this._objectProtectRecord == null && z10) {
            ObjectProtectRecord createObjectProtect = createObjectProtect();
            createObjectProtect.setProtect(true);
            this._objectProtectRecord = createObjectProtect;
        }
        if (this._scenarioProtectRecord == null && z11) {
            ScenarioProtectRecord createScenarioProtect = createScenarioProtect();
            createScenarioProtect.setProtect(true);
            this._scenarioProtectRecord = createScenarioProtect;
        }
    }

    @Override // lib.zj.office.fc.hssf.record.aggregates.RecordAggregate
    public void visitContainedRecords(RecordAggregate.RecordVisitor recordVisitor) {
        visitIfPresent(this._protectRecord, recordVisitor);
        visitIfPresent(this._objectProtectRecord, recordVisitor);
        visitIfPresent(this._scenarioProtectRecord, recordVisitor);
        visitIfPresent(this._passwordRecord, recordVisitor);
    }
}
