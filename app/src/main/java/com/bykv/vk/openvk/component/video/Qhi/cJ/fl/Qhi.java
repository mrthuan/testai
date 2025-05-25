package com.bykv.vk.openvk.component.video.Qhi.cJ.fl;

import com.bykv.vk.openvk.component.video.Qhi.cJ.WAv;
import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.tom_roush.fontbox.ttf.OS2WindowsMetricsTable;
import java.io.InputStream;
import java.util.List;

/* compiled from: AbsResponseWrapper.java */
/* loaded from: classes.dex */
public abstract class Qhi {
    List<WAv.cJ> Qhi;
    Tgh cJ;

    public abstract InputStream CJ();

    public abstract int Qhi();

    public String Qhi(int i10) {
        switch (i10) {
            case 200:
                return "OK";
            case 201:
                return "Created";
            case 202:
                return "Accepted";
            case 203:
                return "Non-Authoritative";
            case 204:
                return "No Content";
            case 205:
                return "Reset Content";
            case 206:
                return "Partial Content";
            default:
                switch (i10) {
                    case OS2WindowsMetricsTable.WEIGHT_CLASS_LIGHT /* 300 */:
                        return "Multiple Choices";
                    case 301:
                        return "Moved Permanently";
                    case 302:
                        return "Temporary Redirect";
                    case 303:
                        return "See Other";
                    case 304:
                        return "Not Modified";
                    case 305:
                        return "Use Proxy";
                    default:
                        switch (i10) {
                            case 400:
                                return "Bad Request";
                            case TTAdConstant.MATE_IS_NULL_CODE /* 401 */:
                                return "Unauthorized";
                            case TTAdConstant.AD_ID_IS_NULL_CODE /* 402 */:
                                return "Payment Required";
                            case TTAdConstant.DEEPLINK_UNAVAILABLE_CODE /* 403 */:
                                return "Forbidden";
                            case TTAdConstant.DEEPLINK_FALLBACK_CODE /* 404 */:
                                return "Not Found";
                            case TTAdConstant.DEEPLINK_FALLBACK_TYPE_CODE /* 405 */:
                                return "Method Not Allowed";
                            case TTAdConstant.LANDING_PAGE_TYPE_CODE /* 406 */:
                                return "Not Acceptable";
                            case TTAdConstant.DOWNLOAD_APP_INFO_CODE /* 407 */:
                                return "Proxy Authentication Required";
                            case TTAdConstant.DOWNLOAD_URL_CODE /* 408 */:
                                return "Request Time-Out";
                            case TTAdConstant.IMAGE_LIST_CODE /* 409 */:
                                return "Conflict";
                            case TTAdConstant.IMAGE_LIST_SIZE_CODE /* 410 */:
                                return "Gone";
                            case TTAdConstant.IMAGE_CODE /* 411 */:
                                return "Length Required";
                            case TTAdConstant.IMAGE_URL_CODE /* 412 */:
                                return "Precondition Failed";
                            case TTAdConstant.VIDEO_INFO_CODE /* 413 */:
                                return "Request Entity Too Large";
                            case TTAdConstant.VIDEO_URL_CODE /* 414 */:
                                return "Request-URI Too Large";
                            case TTAdConstant.VIDEO_COVER_URL_CODE /* 415 */:
                                return "Unsupported Media Type";
                            default:
                                switch (i10) {
                                    case OS2WindowsMetricsTable.WEIGHT_CLASS_MEDIUM /* 500 */:
                                        return "Internal Server Error";
                                    case PglCryptUtils.LOAD_SO_FAILED /* 501 */:
                                        return "Not Implemented";
                                    case PglCryptUtils.INPUT_INVALID /* 502 */:
                                        return "Bad Gateway";
                                    case PglCryptUtils.COMPRESS_FAILED /* 503 */:
                                        return "Service Unavailable";
                                    case PglCryptUtils.BASE64_FAILED /* 504 */:
                                        return "Gateway Timeout";
                                    case PglCryptUtils.ENCRYPT_FAILED /* 505 */:
                                        return "HTTP Version Not Supported";
                                    default:
                                        return "";
                                }
                        }
                }
        }
    }

    public abstract String Qhi(String str, String str2);

    public Tgh ROR() {
        return this.cJ;
    }

    public abstract String Tgh();

    public abstract List<WAv.cJ> ac();

    public abstract boolean cJ();

    public abstract String fl();

    public WAv.cJ Qhi(String str) {
        List<WAv.cJ> list;
        if (str != null && (list = this.Qhi) != null && list.size() > 0) {
            for (WAv.cJ cJVar : this.Qhi) {
                if (str.equals(cJVar.Qhi)) {
                    return cJVar;
                }
            }
        }
        return null;
    }
}
