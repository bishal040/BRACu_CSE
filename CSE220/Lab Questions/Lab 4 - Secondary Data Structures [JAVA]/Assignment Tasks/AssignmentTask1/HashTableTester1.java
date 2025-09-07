public class HashTableTester1 {
  public static void main(String[] args) {
    
  }

  public static void insert_HashTable(String key, int value, Node[] ht){
    int idx = hash_Function(key);
    Node n = new Node(key,value);
    Node head = ht[idx];
    
    boolean flag = false;
      if(ht[idx]!=null){
        Node temp = ht[idx];
        while(temp != null){
          if(temp.key.equals(key)){
            flag = true;
            break;
          }
          temp = temp.next;
        }
        Node newNode = new Node(key, value);
        if(flag){
          temp.value = value;
          return;
        }
        else{
          if(value%2==0){
            newNode.next = head;
            ht[idx] = newNode;
          }
          else{
            Node temp1 = head;
            while(temp1.next != null){
              temp1 = temp1.next;
            }
            temp1.next = newNode;
          }
        }
      }
    }
  }

