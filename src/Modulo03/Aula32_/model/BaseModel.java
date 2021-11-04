package Modulo03.Aula32_.model;

import Modulo02.Aula18.P3.modelo.Base;

public abstract class BaseModel {
    public int id;
    

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof BaseModel){
            BaseModel outro = (BaseModel)obj;
            if(outro.id == this.id){
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return Integer.toString(this.id);
    }
}
