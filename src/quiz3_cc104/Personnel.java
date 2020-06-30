/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quiz3_cc104;

/**
 *
 * @author Fairy
 */
public class Personnel<E> {

    /**
     * @return the Num_que
     */
    public Integer getNum_que() {
        return Num_que;
    }

    /**
     * @param Num_que the Num_que to set
     */
    public void setNum_que(Integer Num_que) {
        this.Num_que = Num_que;
    }

    /**
     * @return the Name
     */
    public String getName() {
        return Name;
    }

    /**
     * @param Name the Name to set
     */
    public void setName(String Name) {
        this.Name = Name;
    }
   private Integer Num_que;
   private String Name;
   
   public Personnel(Integer Num_que, String Name){ 
      
       this.Num_que= Num_que;
       this.Name = Name;
  
   }
   
}
