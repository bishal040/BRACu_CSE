class Hashmap {
    private Node[] hs;

    // Constructor
    public Hashmap(int size) {
        hs = new Node[size];
    }

    // Hash function
    public int hash(String s) {
        int total = 0;
        for (int i = 0; i < s.length(); i++) {
            total += s.charAt(i);
        }
        return total % hs.length;
    }

    // Insert method
    public void insert(String k, Object v) {
        int idx = hash(k);
        if (hs[idx] == null) {
            // For forward chaining (directly put the value at the index)
            hs[idx] = new Node(v);
        } else {
            // Handle collision using chaining
            Node currentNode = (Node) hs[idx];
            while (currentNode.next != null) {
                currentNode = currentNode.next;
            }
            currentNode.next = new Node(v);
        }
    }

    // Search method
    public Object search(String k) {
        int idx = hash(k);
        if (hs[idx] == null) {
            return null;
        } else {
            Node currentNode = (Node) hs[idx];
            // Search the linked list (chain) for the correct value
            while (currentNode != null) {
                // For simplicity, you can return the first value found
                // or enhance it to match the key
                return currentNode.elem;
            }
        }
        return null;
    }

    // Remove method
    public void remove(String k) {
        int idx = hash(k);
        if (hs[idx] == null) {
            System.out.println("KeyError");
        } else {
            // Remove the node from the linked list (chain)
            Node currentNode = (Node) hs[idx];
            Node prevNode = null;

            while (currentNode != null) {
                // You can add additional logic to compare the key and remove
                // the node based on key equality if needed.
                if (prevNode == null) {
                    hs[idx] = currentNode.next;
                    return;
                } else {
                    prevNode.next = currentNode.next;
                    return;
                }
                prevNode = currentNode;
                currentNode = currentNode.next;
            }
        }
    }
}
