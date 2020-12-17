package exercise11;

public class LinkedStack {
    private Node topNode;

    public boolean isEmpty() {
        // Check if stack has no elements
        return topNode == null;
    }

    public void push(String data) {
        // Push element to stack
        Node newNode = new Node(data);

        if (isEmpty()) {
            topNode = newNode;
        } else {
            newNode.setNextNode(topNode);
            topNode = newNode;
        }
    }

    public String pop() {
        // Pop element from stack
        if (isEmpty()) {
            return null;
        } else {
            String data = topNode.getData();
            topNode = topNode.getNextNode();
            return data;
        }

    }

    @Override
    public String toString() {
        return NodeUtils.createNodeTraversalString(topNode);
    }
}
