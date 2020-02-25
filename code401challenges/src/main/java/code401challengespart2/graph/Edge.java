package code401challengespart2.graph;

public class Edge<T, W> {
    private T value;
    private W weight;



    public Edge(T value, W weight) {
        this.value = value;
        this.weight = weight;
    }

    public Edge(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    public W getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        return "Edge{" +
                "value=" + value +
                ", weight=" + weight +
                '}';
    }
}

