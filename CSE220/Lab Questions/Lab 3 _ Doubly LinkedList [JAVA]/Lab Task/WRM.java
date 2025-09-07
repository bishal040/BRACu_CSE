public class WRM {
    Patient dh;

    //The constructor is already created for you
    public WRM() {
        dh = new Patient(null, null, null, null, null, null);
        dh.next = dh;
        dh.prev = dh;
    }

    public void registerPatient(int id, String name, int age, String bloodgroup) {

        Patient p = new Patient(id,name,age,bloodgroup,null,null);
        dh.prev.next = p;
        p.prev = dh.prev.next;
        p.next = dh;
        dh.prev = p;
    }

    public void servePatient() {
        Patient temp = dh.next.next;
        if(temp ==dh){
            dh.next = dh;
            dh.prev = dh; 
        }
        temp.prev.prev =dh;
        dh.next = dh.next.next;

    }

    public void showAllPatient() {
        if(dh.next == dh && dh.prev == dh){
            System.out.println("No Patients");
        }
        Patient temp = dh.next;
        while(temp!=dh){
            System.out.println(temp.id);
            temp = temp.next;
        }
    }

    public Boolean canDoctorGoHome() {
        if(dh.next==dh)
        return true;
        return false; // Delete this line once you're ready
    }

    public void cancelAll() {
        dh.next = dh;
        dh.prev = dh;
    }


    public void reverseTheLine() {
        Patient dh1 = dh;
        Patient temp = null;
        while(dh1==dh){
            temp = dh1.prev;
            dh1.prev = dh1.next;
            dh1.next = temp;
            dh1=dh1.next;
        }

    }

}