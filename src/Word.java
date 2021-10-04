public class Word {
    private String work_target;

    private String work_explain;

    public Word(String work_target,String work_explain){
        this.work_target = work_target;
        this.work_explain = work_explain;
    }

    public void setWork_explain(String work_explain) {
        this.work_explain = work_explain;
    }

    public void setWork_target(String work_target) {
        this.work_target = work_target;
    }

    public String getWork_explain() {
        return work_explain;
    }

    public String getWork_target() {
        return work_target;
    }
}
