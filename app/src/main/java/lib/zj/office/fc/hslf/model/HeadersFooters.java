package lib.zj.office.fc.hslf.model;

import lib.zj.office.fc.hslf.record.CString;
import lib.zj.office.fc.hslf.record.Document;
import lib.zj.office.fc.hslf.record.HeadersFootersContainer;
import lib.zj.office.fc.hslf.record.Record;
import lib.zj.office.fc.hslf.record.RecordTypes;
import lib.zj.office.fc.hslf.usermodel.SlideShow;

/* loaded from: classes3.dex */
public final class HeadersFooters {
    private HeadersFootersContainer _container;
    private boolean _newRecord;
    private SlideShow _ppt;
    private boolean _ppt2007 = false;
    private Sheet _sheet;

    public HeadersFooters(HeadersFootersContainer headersFootersContainer, SlideShow slideShow, boolean z10, boolean z11) {
        this._container = headersFootersContainer;
        this._newRecord = z10;
        this._ppt = slideShow;
    }

    private void attach() {
        Record record;
        Document documentRecord = this._ppt.getDocumentRecord();
        Record[] childRecords = documentRecord.getChildRecords();
        int i10 = 0;
        while (true) {
            if (i10 < childRecords.length) {
                if (childRecords[i10].getRecordType() == RecordTypes.List.typeID) {
                    record = childRecords[i10];
                    break;
                }
                i10++;
            } else {
                record = null;
                break;
            }
        }
        documentRecord.addChildAfter(this._container, record);
        this._newRecord = false;
    }

    private String getPlaceholderText(int i10, CString cString) {
        String str;
        if (this._ppt2007) {
            Sheet sheet = this._sheet;
            if (sheet == null) {
                sheet = this._ppt.getSlidesMasters()[0];
            }
            TextShape placeholder = sheet.getPlaceholder(i10);
            if (placeholder != null) {
                str = placeholder.getText();
            } else {
                str = null;
            }
            if ("*".equals(str)) {
                return null;
            }
            return str;
        } else if (cString == null) {
            return null;
        } else {
            return cString.getText();
        }
    }

    private boolean isVisible(int i10, int i11) {
        if (this._ppt2007) {
            Sheet sheet = this._sheet;
            if (sheet == null) {
                sheet = this._ppt.getSlidesMasters()[0];
            }
            TextShape placeholder = sheet.getPlaceholder(i11);
            if (placeholder == null || placeholder.getText() == null) {
                return false;
            }
            return true;
        }
        return this._container.getHeadersFootersAtom().getFlag(i10);
    }

    public int getDateTimeFormat() {
        return this._container.getHeadersFootersAtom().getFormatId();
    }

    public String getDateTimeText() {
        CString userDateAtom;
        HeadersFootersContainer headersFootersContainer = this._container;
        if (headersFootersContainer == null) {
            userDateAtom = null;
        } else {
            userDateAtom = headersFootersContainer.getUserDateAtom();
        }
        return getPlaceholderText(7, userDateAtom);
    }

    public String getFooterText() {
        CString footerAtom;
        HeadersFootersContainer headersFootersContainer = this._container;
        if (headersFootersContainer == null) {
            footerAtom = null;
        } else {
            footerAtom = headersFootersContainer.getFooterAtom();
        }
        return getPlaceholderText(9, footerAtom);
    }

    public String getHeaderText() {
        CString headerAtom;
        HeadersFootersContainer headersFootersContainer = this._container;
        if (headersFootersContainer == null) {
            headerAtom = null;
        } else {
            headerAtom = headersFootersContainer.getHeaderAtom();
        }
        return getPlaceholderText(10, headerAtom);
    }

    public boolean isDateTimeVisible() {
        return isVisible(1, 7);
    }

    public boolean isFooterVisible() {
        return isVisible(32, 9);
    }

    public boolean isHeaderVisible() {
        return isVisible(16, 10);
    }

    public boolean isSlideNumberVisible() {
        return isVisible(8, 8);
    }

    public boolean isUserDateVisible() {
        return isVisible(4, 7);
    }

    public void setDateTimeFormat(int i10) {
        if (this._newRecord) {
            attach();
        }
        this._container.getHeadersFootersAtom().setFormatId(i10);
    }

    public void setDateTimeText(String str) {
        if (this._newRecord) {
            attach();
        }
        setUserDateVisible(true);
        setDateTimeVisible(true);
        CString userDateAtom = this._container.getUserDateAtom();
        if (userDateAtom == null) {
            userDateAtom = this._container.addUserDateAtom();
        }
        userDateAtom.setText(str);
    }

    public void setDateTimeVisible(boolean z10) {
        if (this._newRecord) {
            attach();
        }
        this._container.getHeadersFootersAtom().setFlag(1, z10);
    }

    public void setFooterVisible(boolean z10) {
        if (this._newRecord) {
            attach();
        }
        this._container.getHeadersFootersAtom().setFlag(32, z10);
    }

    public void setFootersText(String str) {
        if (this._newRecord) {
            attach();
        }
        setFooterVisible(true);
        CString footerAtom = this._container.getFooterAtom();
        if (footerAtom == null) {
            footerAtom = this._container.addFooterAtom();
        }
        footerAtom.setText(str);
    }

    public void setHeaderText(String str) {
        if (this._newRecord) {
            attach();
        }
        setHeaderVisible(true);
        CString headerAtom = this._container.getHeaderAtom();
        if (headerAtom == null) {
            headerAtom = this._container.addHeaderAtom();
        }
        headerAtom.setText(str);
    }

    public void setHeaderVisible(boolean z10) {
        if (this._newRecord) {
            attach();
        }
        this._container.getHeadersFootersAtom().setFlag(16, z10);
    }

    public void setSlideNumberVisible(boolean z10) {
        if (this._newRecord) {
            attach();
        }
        this._container.getHeadersFootersAtom().setFlag(8, z10);
    }

    public void setUserDateVisible(boolean z10) {
        if (this._newRecord) {
            attach();
        }
        this._container.getHeadersFootersAtom().setFlag(4, z10);
    }

    public HeadersFooters(HeadersFootersContainer headersFootersContainer, Sheet sheet, boolean z10, boolean z11) {
        this._container = headersFootersContainer;
        this._newRecord = z10;
        this._sheet = sheet;
    }
}
