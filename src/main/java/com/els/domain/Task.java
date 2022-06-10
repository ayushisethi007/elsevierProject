package com.els.domain;

public class Task {

   private String title;
   private String description;
    private Boolean isTaskFinished;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title=title;
    }

    public String getDescription(){
        return description;
    }

    public void setDescription(String description){
        this.description=description;
    }

    public Boolean getIsTaskFinished(){
        return  isTaskFinished;
    }

    public void setIsTaskFinished(Boolean isTaskFinished){
        this.isTaskFinished= isTaskFinished;
    }


}
