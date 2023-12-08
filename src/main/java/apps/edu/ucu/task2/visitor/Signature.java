package apps.edu.ucu.task2.visitor;

import java.util.UUID;
import java.util.function.Consumer;

public class Signature<T> extends Task<T> {
    private boolean isStamped;
    public Consumer<T> consumer;

    public Signature(Consumer<T> consumer) {
        this.consumer = consumer;
        this.isStamped = false;
    }

    public void apply(T arg) {
        this.freeze();
        consumer.accept(arg);
    }

    public void stampWithGroupId(String groupId) {
        setHeader("groupId", groupId);
        isStamped = true;
    }

    public boolean isStamped() {
        return isStamped;
    }
}
