package lib.zj.office.fc.ss.usermodel;

/* loaded from: classes3.dex */
public interface RichTextString {
    void applyFont(int i10, int i11, IFont iFont);

    void applyFont(int i10, int i11, short s4);

    void applyFont(IFont iFont);

    void applyFont(short s4);

    void clearFormatting();

    int getIndexOfFormattingRun(int i10);

    String getString();

    int length();

    int numFormattingRuns();
}
