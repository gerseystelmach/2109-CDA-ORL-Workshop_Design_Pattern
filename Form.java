public abstract class Form {

    private Integer size;
    private final FormsEnum type;

    public Form(Integer size, FormsEnum type) {
        this.size = size;
        this.type = type;
    }

    public String getFormType() {

        return String.valueOf(this.type);
    }


}
