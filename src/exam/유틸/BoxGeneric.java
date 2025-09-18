package exam.유틸;

public class BoxGeneric<E> {
    
    //가상클래스 E를 사용
    private E obj;

    public void setObj(E obj){
        this.obj = obj;
    }

    public E getObj(){
        return this.obj;
    }

}
