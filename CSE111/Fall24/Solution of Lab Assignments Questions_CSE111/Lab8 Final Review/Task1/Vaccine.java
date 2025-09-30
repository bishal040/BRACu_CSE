public class Vaccine {
 private String name;
 private String origin;
 private int revisit;

public Vaccine(String name,String origin,int revisit) {
    this.name = name;
    this.origin = origin;
    this.revisit = revisit;
}
public Vaccine(Vaccine v) {
    this(v.name,v.origin,v.revisit);
}
public String getName() {
    return name;
}
public String getOrigin() {
    return origin;
}
public int getRevisit() {
    return revisit;
}
}
