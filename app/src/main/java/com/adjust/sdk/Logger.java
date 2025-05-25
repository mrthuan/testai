package com.adjust.sdk;

import android.util.Log;
import java.util.Arrays;
import java.util.Locale;

/* loaded from: classes.dex */
public class Logger implements ILogger {
    private static String formatErrorMessage = "Error formating log message: %s, with params: %s";
    private LogLevel logLevel;
    private boolean isProductionEnvironment = false;
    private boolean logLevelLocked = false;

    public Logger() {
        setLogLevel(LogLevel.INFO, false);
    }

    @Override // com.adjust.sdk.ILogger
    public void Assert(String str, Object... objArr) {
        if (!this.isProductionEnvironment && this.logLevel.androidLogLevel <= 7) {
            try {
                Log.println(7, Constants.LOGTAG, Util.formatString(str, objArr));
            } catch (Exception unused) {
                Util.formatString(formatErrorMessage, str, Arrays.toString(objArr));
            }
        }
    }

    @Override // com.adjust.sdk.ILogger
    public void debug(String str, Object... objArr) {
        if (!this.isProductionEnvironment && this.logLevel.androidLogLevel <= 3) {
            try {
                Util.formatString(str, objArr);
            } catch (Exception unused) {
                Util.formatString(formatErrorMessage, str, Arrays.toString(objArr));
            }
        }
    }

    @Override // com.adjust.sdk.ILogger
    public void error(String str, Object... objArr) {
        if (!this.isProductionEnvironment && this.logLevel.androidLogLevel <= 6) {
            try {
                Util.formatString(str, objArr);
            } catch (Exception unused) {
                Util.formatString(formatErrorMessage, str, Arrays.toString(objArr));
            }
        }
    }

    @Override // com.adjust.sdk.ILogger
    public void info(String str, Object... objArr) {
        if (!this.isProductionEnvironment && this.logLevel.androidLogLevel <= 4) {
            try {
                Util.formatString(str, objArr);
            } catch (Exception unused) {
                Util.formatString(formatErrorMessage, str, Arrays.toString(objArr));
            }
        }
    }

    @Override // com.adjust.sdk.ILogger
    public void lockLogLevel() {
        this.logLevelLocked = true;
    }

    @Override // com.adjust.sdk.ILogger
    public void setLogLevel(LogLevel logLevel, boolean z10) {
        if (this.logLevelLocked) {
            return;
        }
        this.logLevel = logLevel;
        this.isProductionEnvironment = z10;
    }

    @Override // com.adjust.sdk.ILogger
    public void setLogLevelString(String str, boolean z10) {
        if (str != null) {
            try {
                setLogLevel(LogLevel.valueOf(str.toUpperCase(Locale.US)), z10);
            } catch (IllegalArgumentException unused) {
                error("Malformed logLevel '%s', falling back to 'info'", str);
            }
        }
    }

    @Override // com.adjust.sdk.ILogger
    public void verbose(String str, Object... objArr) {
        if (!this.isProductionEnvironment && this.logLevel.androidLogLevel <= 2) {
            try {
                Util.formatString(str, objArr);
            } catch (Exception unused) {
                Util.formatString(formatErrorMessage, str, Arrays.toString(objArr));
            }
        }
    }

    @Override // com.adjust.sdk.ILogger
    public void warn(String str, Object... objArr) {
        if (!this.isProductionEnvironment && this.logLevel.androidLogLevel <= 5) {
            try {
                Util.formatString(str, objArr);
            } catch (Exception unused) {
                Util.formatString(formatErrorMessage, str, Arrays.toString(objArr));
            }
        }
    }

    @Override // com.adjust.sdk.ILogger
    public void warnInProduction(String str, Object... objArr) {
        if (this.logLevel.androidLogLevel <= 5) {
            try {
                Util.formatString(str, objArr);
            } catch (Exception unused) {
                Util.formatString(formatErrorMessage, str, Arrays.toString(objArr));
            }
        }
    }
}
