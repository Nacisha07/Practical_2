package org.example;

import java.util.Objects;

public class Staff {

        private String firstName;
        private String lastName;

        public String getFirstName() {
            return firstName;
        }

        public String getLastName() {
            return lastName;
        }

        public Staff(Employee employee) {
            this.firstName = employee.firstName;
            this.lastName = employee.lastName;
        }

        public static class Employee {
            private String firstName;
            private String lastName;

            public Employee firstName (String i) {
                this.firstName = i;
                return this;
            }

            public Employee lastName (String i) {
                this.lastName = i;
                return this;
            }

            public Staff build() {
                return new Staff(this);
            }
        }

        @Override
        public boolean equals (Object o) {
            if (this == o)
                return true;
            if (!(o instanceof Staff))
                return false;
            Staff staff = (Staff) o;
            return Objects.equals(getFirstName(), staff.getFirstName());
        }

        @Override
        public int hashCode() {
            return Objects.hash(getFirstName());
        }
}
