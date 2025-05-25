package com.tom_roush.pdfbox.pdmodel.common.function.type4;

import java.util.Stack;

/* loaded from: classes2.dex */
class ArithmeticOperators {

    /* loaded from: classes2.dex */
    public static class Abs implements Operator {
        @Override // com.tom_roush.pdfbox.pdmodel.common.function.type4.Operator
        public void execute(ExecutionContext executionContext) {
            Number popNumber = executionContext.popNumber();
            if (popNumber instanceof Integer) {
                executionContext.getStack().push(Integer.valueOf(Math.abs(popNumber.intValue())));
            } else {
                executionContext.getStack().push(Float.valueOf(Math.abs(popNumber.floatValue())));
            }
        }
    }

    /* loaded from: classes2.dex */
    public static class Add implements Operator {
        @Override // com.tom_roush.pdfbox.pdmodel.common.function.type4.Operator
        public void execute(ExecutionContext executionContext) {
            Number popNumber = executionContext.popNumber();
            Number popNumber2 = executionContext.popNumber();
            if ((popNumber2 instanceof Integer) && (popNumber instanceof Integer)) {
                long longValue = popNumber.longValue() + popNumber2.longValue();
                if (longValue >= -2147483648L && longValue <= 2147483647L) {
                    executionContext.getStack().push(Integer.valueOf((int) longValue));
                    return;
                } else {
                    executionContext.getStack().push(Float.valueOf((float) longValue));
                    return;
                }
            }
            executionContext.getStack().push(Float.valueOf(popNumber.floatValue() + popNumber2.floatValue()));
        }
    }

    /* loaded from: classes2.dex */
    public static class Atan implements Operator {
        @Override // com.tom_roush.pdfbox.pdmodel.common.function.type4.Operator
        public void execute(ExecutionContext executionContext) {
            float degrees = ((float) Math.toDegrees((float) Math.atan2(executionContext.popReal(), executionContext.popReal()))) % 360.0f;
            if (degrees < 0.0f) {
                degrees += 360.0f;
            }
            executionContext.getStack().push(Float.valueOf(degrees));
        }
    }

    /* loaded from: classes2.dex */
    public static class Ceiling implements Operator {
        @Override // com.tom_roush.pdfbox.pdmodel.common.function.type4.Operator
        public void execute(ExecutionContext executionContext) {
            Number popNumber = executionContext.popNumber();
            if (popNumber instanceof Integer) {
                executionContext.getStack().push(popNumber);
            } else {
                executionContext.getStack().push(Float.valueOf((float) Math.ceil(popNumber.doubleValue())));
            }
        }
    }

    /* loaded from: classes2.dex */
    public static class Cos implements Operator {
        @Override // com.tom_roush.pdfbox.pdmodel.common.function.type4.Operator
        public void execute(ExecutionContext executionContext) {
            executionContext.getStack().push(Float.valueOf((float) Math.cos(Math.toRadians(executionContext.popReal()))));
        }
    }

    /* loaded from: classes2.dex */
    public static class Cvi implements Operator {
        @Override // com.tom_roush.pdfbox.pdmodel.common.function.type4.Operator
        public void execute(ExecutionContext executionContext) {
            executionContext.getStack().push(Integer.valueOf(executionContext.popNumber().intValue()));
        }
    }

    /* loaded from: classes2.dex */
    public static class Cvr implements Operator {
        @Override // com.tom_roush.pdfbox.pdmodel.common.function.type4.Operator
        public void execute(ExecutionContext executionContext) {
            executionContext.getStack().push(Float.valueOf(executionContext.popNumber().floatValue()));
        }
    }

    /* loaded from: classes2.dex */
    public static class Div implements Operator {
        @Override // com.tom_roush.pdfbox.pdmodel.common.function.type4.Operator
        public void execute(ExecutionContext executionContext) {
            Number popNumber = executionContext.popNumber();
            executionContext.getStack().push(Float.valueOf(executionContext.popNumber().floatValue() / popNumber.floatValue()));
        }
    }

    /* loaded from: classes2.dex */
    public static class Exp implements Operator {
        @Override // com.tom_roush.pdfbox.pdmodel.common.function.type4.Operator
        public void execute(ExecutionContext executionContext) {
            executionContext.getStack().push(Float.valueOf((float) Math.pow(executionContext.popNumber().doubleValue(), executionContext.popNumber().doubleValue())));
        }
    }

    /* loaded from: classes2.dex */
    public static class Floor implements Operator {
        @Override // com.tom_roush.pdfbox.pdmodel.common.function.type4.Operator
        public void execute(ExecutionContext executionContext) {
            Number popNumber = executionContext.popNumber();
            if (popNumber instanceof Integer) {
                executionContext.getStack().push(popNumber);
            } else {
                executionContext.getStack().push(Float.valueOf((float) Math.floor(popNumber.doubleValue())));
            }
        }
    }

    /* loaded from: classes2.dex */
    public static class IDiv implements Operator {
        @Override // com.tom_roush.pdfbox.pdmodel.common.function.type4.Operator
        public void execute(ExecutionContext executionContext) {
            int popInt = executionContext.popInt();
            executionContext.getStack().push(Integer.valueOf(executionContext.popInt() / popInt));
        }
    }

    /* loaded from: classes2.dex */
    public static class Ln implements Operator {
        @Override // com.tom_roush.pdfbox.pdmodel.common.function.type4.Operator
        public void execute(ExecutionContext executionContext) {
            executionContext.getStack().push(Float.valueOf((float) Math.log(executionContext.popNumber().doubleValue())));
        }
    }

    /* loaded from: classes2.dex */
    public static class Log implements Operator {
        @Override // com.tom_roush.pdfbox.pdmodel.common.function.type4.Operator
        public void execute(ExecutionContext executionContext) {
            executionContext.getStack().push(Float.valueOf((float) Math.log10(executionContext.popNumber().doubleValue())));
        }
    }

    /* loaded from: classes2.dex */
    public static class Mod implements Operator {
        @Override // com.tom_roush.pdfbox.pdmodel.common.function.type4.Operator
        public void execute(ExecutionContext executionContext) {
            int popInt = executionContext.popInt();
            executionContext.getStack().push(Integer.valueOf(executionContext.popInt() % popInt));
        }
    }

    /* loaded from: classes2.dex */
    public static class Mul implements Operator {
        @Override // com.tom_roush.pdfbox.pdmodel.common.function.type4.Operator
        public void execute(ExecutionContext executionContext) {
            Number popNumber = executionContext.popNumber();
            Number popNumber2 = executionContext.popNumber();
            if ((popNumber2 instanceof Integer) && (popNumber instanceof Integer)) {
                long longValue = popNumber.longValue() * popNumber2.longValue();
                if (longValue >= -2147483648L && longValue <= 2147483647L) {
                    executionContext.getStack().push(Integer.valueOf((int) longValue));
                    return;
                } else {
                    executionContext.getStack().push(Float.valueOf((float) longValue));
                    return;
                }
            }
            executionContext.getStack().push(Float.valueOf((float) (popNumber.doubleValue() * popNumber2.doubleValue())));
        }
    }

    /* loaded from: classes2.dex */
    public static class Neg implements Operator {
        @Override // com.tom_roush.pdfbox.pdmodel.common.function.type4.Operator
        public void execute(ExecutionContext executionContext) {
            Number popNumber = executionContext.popNumber();
            if (popNumber instanceof Integer) {
                if (popNumber.intValue() == Integer.MIN_VALUE) {
                    executionContext.getStack().push(Float.valueOf(-popNumber.floatValue()));
                    return;
                } else {
                    executionContext.getStack().push(Integer.valueOf(-popNumber.intValue()));
                    return;
                }
            }
            executionContext.getStack().push(Float.valueOf(-popNumber.floatValue()));
        }
    }

    /* loaded from: classes2.dex */
    public static class Round implements Operator {
        @Override // com.tom_roush.pdfbox.pdmodel.common.function.type4.Operator
        public void execute(ExecutionContext executionContext) {
            Number popNumber = executionContext.popNumber();
            if (popNumber instanceof Integer) {
                executionContext.getStack().push(Integer.valueOf(popNumber.intValue()));
            } else {
                executionContext.getStack().push(Float.valueOf((float) Math.round(popNumber.doubleValue())));
            }
        }
    }

    /* loaded from: classes2.dex */
    public static class Sin implements Operator {
        @Override // com.tom_roush.pdfbox.pdmodel.common.function.type4.Operator
        public void execute(ExecutionContext executionContext) {
            executionContext.getStack().push(Float.valueOf((float) Math.sin(Math.toRadians(executionContext.popReal()))));
        }
    }

    /* loaded from: classes2.dex */
    public static class Sqrt implements Operator {
        @Override // com.tom_roush.pdfbox.pdmodel.common.function.type4.Operator
        public void execute(ExecutionContext executionContext) {
            float popReal = executionContext.popReal();
            if (popReal >= 0.0f) {
                executionContext.getStack().push(Float.valueOf((float) Math.sqrt(popReal)));
                return;
            }
            throw new IllegalArgumentException("argument must be nonnegative");
        }
    }

    /* loaded from: classes2.dex */
    public static class Sub implements Operator {
        @Override // com.tom_roush.pdfbox.pdmodel.common.function.type4.Operator
        public void execute(ExecutionContext executionContext) {
            Stack<Object> stack = executionContext.getStack();
            Number popNumber = executionContext.popNumber();
            Number popNumber2 = executionContext.popNumber();
            if ((popNumber2 instanceof Integer) && (popNumber instanceof Integer)) {
                long longValue = popNumber2.longValue() - popNumber.longValue();
                if (longValue >= -2147483648L && longValue <= 2147483647L) {
                    stack.push(Integer.valueOf((int) longValue));
                    return;
                } else {
                    stack.push(Float.valueOf((float) longValue));
                    return;
                }
            }
            stack.push(Float.valueOf(popNumber2.floatValue() - popNumber.floatValue()));
        }
    }

    /* loaded from: classes2.dex */
    public static class Truncate implements Operator {
        @Override // com.tom_roush.pdfbox.pdmodel.common.function.type4.Operator
        public void execute(ExecutionContext executionContext) {
            Number popNumber = executionContext.popNumber();
            if (popNumber instanceof Integer) {
                executionContext.getStack().push(Integer.valueOf(popNumber.intValue()));
            } else {
                executionContext.getStack().push(Float.valueOf((int) popNumber.floatValue()));
            }
        }
    }

    private ArithmeticOperators() {
    }
}
