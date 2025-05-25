package lib.zj.office.fc.ss.usermodel;

/* loaded from: classes3.dex */
public interface Comment {
    String getAuthor();

    int getColumn();

    int getRow();

    RichTextString getString();

    boolean isVisible();

    void setAuthor(String str);

    void setColumn(int i10);

    void setRow(int i10);

    void setString(RichTextString richTextString);

    void setVisible(boolean z10);
}
