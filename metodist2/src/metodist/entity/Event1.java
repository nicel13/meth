package metodist.entity;
// Generated 14.10.2019 8:27:56 by Hibernate Tools 4.3.1



/**
 * Event1 generated by hbm2java
 */
public class Event1  implements java.io.Serializable {


     private Integer idEvent;
     private String title;

    public Event1() {
    }

    public Event1(String title) {
       this.title = title;
    }
   
    public Integer getIdEvent() {
        return this.idEvent;
    }
    
    public void setIdEvent(Integer idEvent) {
        this.idEvent = idEvent;
    }
    public String getTitle() {
        return this.title;
    }
    
    public void setTitle(String title) {
        this.title = title;
    }




}


