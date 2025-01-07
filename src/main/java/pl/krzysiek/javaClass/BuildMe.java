package pl.krzysiek.javaClass;

import java.time.LocalDate;

public class BuildMe {
    private String name;
    private LocalDate date;

    private BuildMe() {
    }

    public static Builder builder() {
        return new Builder();
    }

    @Override
    public String toString() {
        return "BuildMe{" +
                "name='" + name + '\'' +
                ", date=" + date +
                '}';
    }

    public static class Builder {
        private BuildMe template = new BuildMe();

        private Builder() {
        }

        public Builder name(String name) {
            template.name = name;
            return this;
        }

        public Builder date(LocalDate date) {
            template.date = date;
            return this;
        }

        public BuildMe build() {
            BuildMe rv = template;
            template = null; //don't modify later
            return rv;
        }
    }
}
