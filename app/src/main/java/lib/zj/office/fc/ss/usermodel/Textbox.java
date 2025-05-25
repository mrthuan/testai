package lib.zj.office.fc.ss.usermodel;

/* loaded from: classes3.dex */
public interface Textbox {
    public static final short OBJECT_TYPE_TEXT = 6;

    int getMarginBottom();

    int getMarginLeft();

    int getMarginRight();

    int getMarginTop();

    RichTextString getString();

    void setMarginBottom(int i10);

    void setMarginLeft(int i10);

    void setMarginRight(int i10);

    void setMarginTop(int i10);

    void setString(RichTextString richTextString);
}
