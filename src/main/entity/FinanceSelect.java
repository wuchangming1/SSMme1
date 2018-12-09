package main.entity;

public class FinanceSelect {
    private Integer id;

    private String code;

    private String period;

    private String project;

    private String currentCount;

    private String lastCount;

    private String myDescribe;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code == null ? null : code.trim();
    }

    public String getPeriod() {
        return period;
    }

    public void setPeriod(String period) {
        this.period = period == null ? null : period.trim();
    }

    public String getProject() {
        return project;
    }

    public void setProject(String project) {
        this.project = project == null ? null : project.trim();
    }

    public String getCurrentCount() {
        return currentCount;
    }

    public void setCurrentCount(String currentCount) {
        this.currentCount = currentCount == null ? null : currentCount.trim();
    }

    public String getLastCount() {
        return lastCount;
    }

    public void setLastCount(String lastCount) {
        this.lastCount = lastCount == null ? null : lastCount.trim();
    }

    public String getMyDescribe() {
        return myDescribe;
    }

    public void setMyDescribe(String myDescribe) {
        this.myDescribe = myDescribe == null ? null : myDescribe.trim();
    }
}