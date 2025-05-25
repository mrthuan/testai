package di;

import androidx.activity.r;
import lib.zj.office.fc.hssf.record.BlankRecord;
import lib.zj.office.fc.hssf.record.BoolErrRecord;
import lib.zj.office.fc.hssf.record.CellValueRecordInterface;
import lib.zj.office.fc.hssf.record.FormulaRecord;
import lib.zj.office.fc.hssf.record.LabelSSTRecord;
import lib.zj.office.fc.hssf.record.NumberRecord;
import lib.zj.office.fc.hssf.record.Record;
import lib.zj.office.fc.hssf.record.aggregates.FormulaRecordAggregate;

/* compiled from: ACell.java */
/* loaded from: classes3.dex */
public final class a extends ei.a {

    /* renamed from: i  reason: collision with root package name */
    public CellValueRecordInterface f16202i;

    /* JADX WARN: Code restructure failed: missing block: B:44:0x011a, code lost:
        if (r8 != 6) goto L89;
     */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01eb  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0205  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x021d  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0221  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public a(ei.c r13, lib.zj.office.fc.hssf.record.CellValueRecordInterface r14) {
        /*
            Method dump skipped, instructions count: 596
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: di.a.<init>(ei.c, lib.zj.office.fc.hssf.record.CellValueRecordInterface):void");
    }

    public static void k(int i10, FormulaRecord formulaRecord) {
        int cachedResultType = formulaRecord.getCachedResultType();
        if (cachedResultType == i10) {
            return;
        }
        throw s(i10, cachedResultType, true);
    }

    public static int l(CellValueRecordInterface cellValueRecordInterface) {
        if (cellValueRecordInterface instanceof FormulaRecordAggregate) {
            return 2;
        }
        Record record = (Record) cellValueRecordInterface;
        short sid = record.getSid();
        if (sid != 253) {
            if (sid != 513) {
                switch (sid) {
                    case 515:
                        return 0;
                    case 516:
                        return 1;
                    case 517:
                        if (((BoolErrRecord) record).isBoolean()) {
                            return 4;
                        }
                        return 5;
                    default:
                        throw new RuntimeException("Bad cell value rec (" + cellValueRecordInterface.getClass().getName() + ")");
                }
            }
            return 3;
        }
        return 1;
    }

    public static String n(int i10) {
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 3) {
                        if (i10 != 4) {
                            if (i10 != 5) {
                                return a0.a.g("#unknown cell type (", i10, ")#");
                            }
                            return "error";
                        }
                        return "boolean";
                    }
                    return "blank";
                }
                return "formula";
            }
            return "text";
        }
        return "numeric";
    }

    public static IllegalStateException s(int i10, int i11, boolean z10) {
        String str;
        StringBuilder sb2 = new StringBuilder("Cannot get a ");
        sb2.append(n(i10));
        sb2.append(" value from a ");
        sb2.append(n(i11));
        sb2.append(" ");
        if (z10) {
            str = "formula ";
        } else {
            str = "";
        }
        return new IllegalStateException(r.g(sb2, str, "cell"));
    }

    public final boolean m() {
        short s4 = this.f16589b;
        if (s4 != 2) {
            if (s4 == 3) {
                return false;
            }
            if (s4 == 4) {
                return ((BoolErrRecord) this.f16202i).getBooleanValue();
            }
            throw s(4, s4, false);
        }
        FormulaRecord formulaRecord = ((FormulaRecordAggregate) this.f16202i).getFormulaRecord();
        k(4, formulaRecord);
        return formulaRecord.getCachedBooleanValue();
    }

    public final byte o() {
        short s4 = this.f16589b;
        if (s4 != 2) {
            if (s4 == 5) {
                return ((BoolErrRecord) this.f16202i).getErrorValue();
            }
            throw s(5, s4, false);
        }
        FormulaRecord formulaRecord = ((FormulaRecordAggregate) this.f16202i).getFormulaRecord();
        k(5, formulaRecord);
        return (byte) formulaRecord.getCachedErrorValue();
    }

    public final double p() {
        short s4 = this.f16589b;
        if (s4 != 0) {
            if (s4 != 2) {
                if (s4 == 3) {
                    return 0.0d;
                }
                throw s(0, s4, false);
            }
            FormulaRecord formulaRecord = ((FormulaRecordAggregate) this.f16202i).getFormulaRecord();
            k(0, formulaRecord);
            return formulaRecord.getValue();
        }
        return ((NumberRecord) this.f16202i).getValue();
    }

    public final void q(int i10) {
        r(i10, this.f16202i.getRow(), this.f16202i.getColumn(), this.f16202i.getXFIndex());
    }

    public final void r(int i10, int i11, short s4, short s10) {
        NumberRecord numberRecord;
        LabelSSTRecord labelSSTRecord;
        FormulaRecordAggregate formulaRecordAggregate;
        BlankRecord blankRecord;
        BoolErrRecord boolErrRecord;
        BoolErrRecord boolErrRecord2;
        if (i10 <= 5) {
            if (i10 != 0) {
                if (i10 != 1) {
                    if (i10 != 2) {
                        if (i10 != 3) {
                            if (i10 != 4) {
                                if (i10 == 5) {
                                    if (i10 != this.f16589b) {
                                        boolErrRecord2 = new BoolErrRecord();
                                    } else {
                                        boolErrRecord2 = (BoolErrRecord) this.f16202i;
                                    }
                                    boolErrRecord2.setColumn(s4);
                                    boolErrRecord2.setXFIndex(s10);
                                    boolErrRecord2.setRow(i11);
                                    this.f16202i = boolErrRecord2;
                                }
                            } else {
                                if (i10 != this.f16589b) {
                                    boolErrRecord = new BoolErrRecord();
                                } else {
                                    boolErrRecord = (BoolErrRecord) this.f16202i;
                                }
                                boolErrRecord.setColumn(s4);
                                boolErrRecord.setXFIndex(s10);
                                boolErrRecord.setRow(i11);
                                this.f16202i = boolErrRecord;
                            }
                        } else {
                            if (this.f16589b != i10) {
                                blankRecord = new BlankRecord();
                            } else {
                                blankRecord = (BlankRecord) this.f16202i;
                            }
                            blankRecord.setColumn(s4);
                            blankRecord.setXFIndex(s10);
                            blankRecord.setRow(i11);
                            this.f16202i = blankRecord;
                        }
                    } else {
                        if (this.f16589b != i10) {
                            formulaRecordAggregate = ((c) this.f16588a).f16203y.getRowsAggregate().createFormula(i11, s4);
                        } else {
                            FormulaRecordAggregate formulaRecordAggregate2 = (FormulaRecordAggregate) this.f16202i;
                            formulaRecordAggregate2.setRow(i11);
                            formulaRecordAggregate2.setColumn(s4);
                            formulaRecordAggregate = formulaRecordAggregate2;
                        }
                        formulaRecordAggregate.setXFIndex(s10);
                        this.f16202i = formulaRecordAggregate;
                    }
                } else {
                    if (i10 == this.f16589b) {
                        labelSSTRecord = (LabelSSTRecord) this.f16202i;
                    } else {
                        LabelSSTRecord labelSSTRecord2 = new LabelSSTRecord();
                        labelSSTRecord2.setColumn(s4);
                        labelSSTRecord2.setRow(i11);
                        labelSSTRecord2.setXFIndex(s10);
                        labelSSTRecord = labelSSTRecord2;
                    }
                    this.f16202i = labelSSTRecord;
                }
            } else {
                if (i10 != this.f16589b) {
                    numberRecord = new NumberRecord();
                } else {
                    numberRecord = (NumberRecord) this.f16202i;
                }
                numberRecord.setColumn(s4);
                numberRecord.setXFIndex(s10);
                numberRecord.setRow(i11);
                this.f16202i = numberRecord;
            }
            this.f16589b = (short) i10;
            return;
        }
        throw new RuntimeException("I have no idea what type that is!");
    }

    public a(c cVar, int i10, short s4) {
        super((short) 5);
        this.f16588a = cVar;
        r(3, i10, s4, cVar.f16203y.getXFIndexForColAt(s4));
    }
}
