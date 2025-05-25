package com.tom_roush.pdfbox.contentstream;

import android.graphics.Path;
import android.graphics.PointF;
import com.tom_roush.pdfbox.contentstream.operator.color.SetNonStrokingColor;
import com.tom_roush.pdfbox.contentstream.operator.color.SetNonStrokingColorN;
import com.tom_roush.pdfbox.contentstream.operator.color.SetNonStrokingColorSpace;
import com.tom_roush.pdfbox.contentstream.operator.color.SetNonStrokingDeviceCMYKColor;
import com.tom_roush.pdfbox.contentstream.operator.color.SetNonStrokingDeviceGrayColor;
import com.tom_roush.pdfbox.contentstream.operator.color.SetNonStrokingDeviceRGBColor;
import com.tom_roush.pdfbox.contentstream.operator.color.SetStrokingColor;
import com.tom_roush.pdfbox.contentstream.operator.color.SetStrokingColorN;
import com.tom_roush.pdfbox.contentstream.operator.color.SetStrokingColorSpace;
import com.tom_roush.pdfbox.contentstream.operator.color.SetStrokingDeviceCMYKColor;
import com.tom_roush.pdfbox.contentstream.operator.color.SetStrokingDeviceGrayColor;
import com.tom_roush.pdfbox.contentstream.operator.color.SetStrokingDeviceRGBColor;
import com.tom_roush.pdfbox.contentstream.operator.graphics.AppendRectangleToPath;
import com.tom_roush.pdfbox.contentstream.operator.graphics.BeginInlineImage;
import com.tom_roush.pdfbox.contentstream.operator.graphics.ClipEvenOddRule;
import com.tom_roush.pdfbox.contentstream.operator.graphics.ClipNonZeroRule;
import com.tom_roush.pdfbox.contentstream.operator.graphics.CloseAndStrokePath;
import com.tom_roush.pdfbox.contentstream.operator.graphics.CloseFillEvenOddAndStrokePath;
import com.tom_roush.pdfbox.contentstream.operator.graphics.CloseFillNonZeroAndStrokePath;
import com.tom_roush.pdfbox.contentstream.operator.graphics.ClosePath;
import com.tom_roush.pdfbox.contentstream.operator.graphics.CurveTo;
import com.tom_roush.pdfbox.contentstream.operator.graphics.CurveToReplicateFinalPoint;
import com.tom_roush.pdfbox.contentstream.operator.graphics.CurveToReplicateInitialPoint;
import com.tom_roush.pdfbox.contentstream.operator.graphics.DrawObject;
import com.tom_roush.pdfbox.contentstream.operator.graphics.EndPath;
import com.tom_roush.pdfbox.contentstream.operator.graphics.FillEvenOddAndStrokePath;
import com.tom_roush.pdfbox.contentstream.operator.graphics.FillEvenOddRule;
import com.tom_roush.pdfbox.contentstream.operator.graphics.FillNonZeroAndStrokePath;
import com.tom_roush.pdfbox.contentstream.operator.graphics.FillNonZeroRule;
import com.tom_roush.pdfbox.contentstream.operator.graphics.LegacyFillNonZeroRule;
import com.tom_roush.pdfbox.contentstream.operator.graphics.LineTo;
import com.tom_roush.pdfbox.contentstream.operator.graphics.MoveTo;
import com.tom_roush.pdfbox.contentstream.operator.graphics.ShadingFill;
import com.tom_roush.pdfbox.contentstream.operator.graphics.StrokePath;
import com.tom_roush.pdfbox.contentstream.operator.markedcontent.BeginMarkedContentSequence;
import com.tom_roush.pdfbox.contentstream.operator.markedcontent.BeginMarkedContentSequenceWithProperties;
import com.tom_roush.pdfbox.contentstream.operator.markedcontent.EndMarkedContentSequence;
import com.tom_roush.pdfbox.contentstream.operator.state.Concatenate;
import com.tom_roush.pdfbox.contentstream.operator.state.Restore;
import com.tom_roush.pdfbox.contentstream.operator.state.Save;
import com.tom_roush.pdfbox.contentstream.operator.state.SetFlatness;
import com.tom_roush.pdfbox.contentstream.operator.state.SetGraphicsStateParameters;
import com.tom_roush.pdfbox.contentstream.operator.state.SetLineCapStyle;
import com.tom_roush.pdfbox.contentstream.operator.state.SetLineDashPattern;
import com.tom_roush.pdfbox.contentstream.operator.state.SetLineJoinStyle;
import com.tom_roush.pdfbox.contentstream.operator.state.SetLineMiterLimit;
import com.tom_roush.pdfbox.contentstream.operator.state.SetLineWidth;
import com.tom_roush.pdfbox.contentstream.operator.state.SetMatrix;
import com.tom_roush.pdfbox.contentstream.operator.state.SetRenderingIntent;
import com.tom_roush.pdfbox.contentstream.operator.text.BeginText;
import com.tom_roush.pdfbox.contentstream.operator.text.EndText;
import com.tom_roush.pdfbox.contentstream.operator.text.MoveText;
import com.tom_roush.pdfbox.contentstream.operator.text.MoveTextSetLeading;
import com.tom_roush.pdfbox.contentstream.operator.text.NextLine;
import com.tom_roush.pdfbox.contentstream.operator.text.SetCharSpacing;
import com.tom_roush.pdfbox.contentstream.operator.text.SetFontAndSize;
import com.tom_roush.pdfbox.contentstream.operator.text.SetTextHorizontalScaling;
import com.tom_roush.pdfbox.contentstream.operator.text.SetTextLeading;
import com.tom_roush.pdfbox.contentstream.operator.text.SetTextRenderingMode;
import com.tom_roush.pdfbox.contentstream.operator.text.SetTextRise;
import com.tom_roush.pdfbox.contentstream.operator.text.SetWordSpacing;
import com.tom_roush.pdfbox.contentstream.operator.text.ShowText;
import com.tom_roush.pdfbox.contentstream.operator.text.ShowTextAdjusted;
import com.tom_roush.pdfbox.contentstream.operator.text.ShowTextLine;
import com.tom_roush.pdfbox.contentstream.operator.text.ShowTextLineAndSpace;
import com.tom_roush.pdfbox.cos.COSName;
import com.tom_roush.pdfbox.pdmodel.PDPage;
import com.tom_roush.pdfbox.pdmodel.graphics.image.PDImage;

/* loaded from: classes2.dex */
public abstract class PDFGraphicsStreamEngine extends PDFStreamEngine {
    private final PDPage page;

    public PDFGraphicsStreamEngine(PDPage pDPage) {
        this.page = pDPage;
        addOperator(new CloseFillNonZeroAndStrokePath());
        addOperator(new FillNonZeroAndStrokePath());
        addOperator(new CloseFillEvenOddAndStrokePath());
        addOperator(new FillEvenOddAndStrokePath());
        addOperator(new BeginInlineImage());
        addOperator(new BeginText());
        addOperator(new CurveTo());
        addOperator(new Concatenate());
        addOperator(new SetStrokingColorSpace());
        addOperator(new SetNonStrokingColorSpace());
        addOperator(new SetLineDashPattern());
        addOperator(new DrawObject());
        addOperator(new EndText());
        addOperator(new FillNonZeroRule());
        addOperator(new LegacyFillNonZeroRule());
        addOperator(new FillEvenOddRule());
        addOperator(new SetStrokingDeviceGrayColor());
        addOperator(new SetNonStrokingDeviceGrayColor());
        addOperator(new SetGraphicsStateParameters());
        addOperator(new ClosePath());
        addOperator(new SetFlatness());
        addOperator(new SetLineJoinStyle());
        addOperator(new SetLineCapStyle());
        addOperator(new SetStrokingDeviceCMYKColor());
        addOperator(new SetNonStrokingDeviceCMYKColor());
        addOperator(new LineTo());
        addOperator(new MoveTo());
        addOperator(new SetLineMiterLimit());
        addOperator(new EndPath());
        addOperator(new Save());
        addOperator(new Restore());
        addOperator(new AppendRectangleToPath());
        addOperator(new SetStrokingDeviceRGBColor());
        addOperator(new SetNonStrokingDeviceRGBColor());
        addOperator(new SetRenderingIntent());
        addOperator(new CloseAndStrokePath());
        addOperator(new StrokePath());
        addOperator(new SetStrokingColor());
        addOperator(new SetNonStrokingColor());
        addOperator(new SetStrokingColorN());
        addOperator(new SetNonStrokingColorN());
        addOperator(new ShadingFill());
        addOperator(new NextLine());
        addOperator(new SetCharSpacing());
        addOperator(new MoveText());
        addOperator(new MoveTextSetLeading());
        addOperator(new SetFontAndSize());
        addOperator(new ShowText());
        addOperator(new ShowTextAdjusted());
        addOperator(new SetTextLeading());
        addOperator(new SetMatrix());
        addOperator(new SetTextRenderingMode());
        addOperator(new SetTextRise());
        addOperator(new SetWordSpacing());
        addOperator(new SetTextHorizontalScaling());
        addOperator(new CurveToReplicateInitialPoint());
        addOperator(new SetLineWidth());
        addOperator(new ClipNonZeroRule());
        addOperator(new ClipEvenOddRule());
        addOperator(new CurveToReplicateFinalPoint());
        addOperator(new ShowTextLine());
        addOperator(new ShowTextLineAndSpace());
        addOperator(new BeginMarkedContentSequence());
        addOperator(new BeginMarkedContentSequenceWithProperties());
        addOperator(new EndMarkedContentSequence());
    }

    public abstract void appendRectangle(PointF pointF, PointF pointF2, PointF pointF3, PointF pointF4);

    public abstract void clip(Path.FillType fillType);

    public abstract void closePath();

    public abstract void curveTo(float f10, float f11, float f12, float f13, float f14, float f15);

    public abstract void drawImage(PDImage pDImage);

    public abstract void endPath();

    public abstract void fillAndStrokePath(Path.FillType fillType);

    public abstract void fillPath(Path.FillType fillType);

    public abstract PointF getCurrentPoint();

    public final PDPage getPage() {
        return this.page;
    }

    public abstract void lineTo(float f10, float f11);

    public abstract void moveTo(float f10, float f11);

    public abstract void shadingFill(COSName cOSName);

    public abstract void strokePath();
}
