package lib.zj.office.fc.ss.usermodel;

/* loaded from: classes3.dex */
public interface Name {
    String getComment();

    String getNameName();

    String getRefersToFormula();

    int getSheetIndex();

    String getSheetName();

    boolean isDeleted();

    boolean isFunctionName();

    void setComment(String str);

    void setFunction(boolean z10);

    void setNameName(String str);

    void setRefersToFormula(String str);

    void setSheetIndex(int i10);
}
