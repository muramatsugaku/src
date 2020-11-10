package ex2.exceptionSample.original;

class CreateException extends RuntimeException {
    //シリアル化
    private static final long serialVersionUID = 1L;

    //ビジネスロジックエラー
    private boolean nameError = false;
    private boolean japError = false;
    private boolean mathError = false;
    private boolean engError = false;

    //コンストラクタ群（自動生成）


    public CreateException(boolean nameError, boolean japError, boolean mathError, boolean engError) {
        this.nameError = nameError;
        this.japError = japError;
        this.mathError = mathError;
        this.engError = engError;
    }

    public CreateException(String message, boolean nameError, boolean japError, boolean mathError, boolean engError) {
        super(message);
        this.nameError = nameError;
        this.japError = japError;
        this.mathError = mathError;
        this.engError = engError;
    }

    public CreateException(String message, Throwable cause, boolean nameError, boolean japError, boolean mathError, boolean engError) {
        super(message, cause);
        this.nameError = nameError;
        this.japError = japError;
        this.mathError = mathError;
        this.engError = engError;
    }

    public CreateException(Throwable cause, boolean nameError, boolean japError, boolean mathError, boolean engError) {
        super(cause);
        this.nameError = nameError;
        this.japError = japError;
        this.mathError = mathError;
        this.engError = engError;
    }

    public CreateException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace, boolean nameError, boolean japError, boolean mathError, boolean engError) {
        super(message, cause, enableSuppression, writableStackTrace);
        this.nameError = nameError;
        this.japError = japError;
        this.mathError = mathError;
        this.engError = engError;
    }

    //ゲッター（自動生成）
    public boolean isNameError() {
        return nameError;
    }

    public boolean isJapError() {
        return japError;
    }

    public boolean isMathError() {
        return mathError;
    }

    public boolean isEngError() {
        return engError;
    }
}
