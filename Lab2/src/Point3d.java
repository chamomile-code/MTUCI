class Point {

        private double x;
        private double y;
        private double z;

        public Point() {
            this.x = 0;
            this.y = 0;
            this.z = 0;
        }

        public Point(double x, double y, double z) {
            this.x = x;
            this.y = y;
            this.z = z;
        }

        public double distanceTo(Point point) {
            return Math.sqrt((x - point.getX()) * (x - point.getX())
                    + (y - point.getY()) * (y - point.getY())
                    + (z - point.getZ()) * (z - point.getZ()));
        }

        public double getX() {
            return x;
        }

        public void setX(double x) {
            this.x = x;
        }

        public double getY() {
            return y;
        }

        public void setY(double y) {
            this.y = y;
        }

        public double getZ() {
            return z;
        }

        public void setZ(double z) {
            this.z = z;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Point point = (Point) o;
            return Double.compare(point.x, x) == 0 &&
                    Double.compare(point.y, y) == 0 &&
                    Double.compare(point.z, z) == 0;
        }
    }

