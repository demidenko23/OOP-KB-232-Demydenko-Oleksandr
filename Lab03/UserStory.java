public class UserStory extends Ticket {
    private final UserStory[] dependencies;

    public UserStory(int id, String name, int estimate, UserStory[] dependencies) {
        super(id, name, estimate);
        this.dependencies = dependencies != null ? dependencies.clone() : new UserStory[0];
    }

    @Override
    public void complete() {
        for (UserStory dependency : dependencies) {
            if (!dependency.isCompleted()) {
                return; // Не можна завершити, якщо залежність не завершена
            }
        }
        super.complete();
    }

    public UserStory[] getDependencies() {
        return dependencies.clone();
    }

    @Override
    public String toString() {
        return "[US " + getId() + "] " + getName();
    }
}
