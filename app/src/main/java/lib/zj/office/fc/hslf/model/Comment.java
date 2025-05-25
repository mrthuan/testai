package lib.zj.office.fc.hslf.model;

import lib.zj.office.fc.hslf.record.Comment2000;

/* loaded from: classes3.dex */
public final class Comment {
    private Comment2000 _comment2000;

    public Comment(Comment2000 comment2000) {
        this._comment2000 = comment2000;
    }

    public String getAuthor() {
        return this._comment2000.getAuthor();
    }

    public String getAuthorInitials() {
        return this._comment2000.getAuthorInitials();
    }

    public Comment2000 getComment2000() {
        return this._comment2000;
    }

    public String getText() {
        return this._comment2000.getText();
    }

    public void setAuthor(String str) {
        this._comment2000.setAuthor(str);
    }

    public void setAuthorInitials(String str) {
        this._comment2000.setAuthorInitials(str);
    }

    public void setText(String str) {
        this._comment2000.setText(str);
    }
}
