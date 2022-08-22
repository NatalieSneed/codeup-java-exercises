package movies;
    public class Movie {
        private String name;
        private String category;

        public Movie(String iName, String iCategory) {
            this.name = iName;
            this.category = iCategory;
        }

        public String getName() {
            return this.name;
        }

        public String getCategory() {
            return this.category;
        }

        public void setName(String iName) {
            this.name = iName;
        }

        public void setCategory(String iCategory) {
            this.category = iCategory;
        }
        @Override
        public String toString() {
            return this.name + " (" + this.category + ")";
        }
        public static void main(String[]args) {


        }
}
