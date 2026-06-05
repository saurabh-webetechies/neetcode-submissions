public class MyHashSet {
  
  static class ListNode{
    int key;
    ListNode next;

    ListNode(int val){
        key = val;
        next = null;
    }
  }

  ListNode[] buckets;

    public MyHashSet() {
         buckets = new ListNode[1000];
        
        for(int i = 0;i<1000; i++){
           buckets[i] = new ListNode(0); 
        }
    }

    public void add(int key) {
        ListNode current = buckets[key % 1000];

        while(current.next != null){
            if(current.next.key == key){
                return;
            }
            current = current.next;
        }

        current.next = new ListNode(key);
        
    }

    public void remove(int key) {
       ListNode current = buckets[key % 1000];
        while(current.next != null){
            if(current.next.key == key){
                current.next  = current.next.next;
                return;
            }
            current = current.next;
        }

    }

    public boolean contains(int key) {
        ListNode current = buckets[key % 1000];

        while(current.next != null){
            if(current.next.key == key){
                    return true;
            }
            current = current.next;
        }
        return false;
    }
}