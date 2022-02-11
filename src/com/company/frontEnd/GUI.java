package com.company.frontEnd;

public class GUI {
        private int gridLength;
        private int gridHeight;

        public GUI(int gridLength, int gridHeight) {
            this.gridLength = gridLength;
            this.gridHeight = gridHeight;
        }

        public int getGridLength() {
            return gridLength;
        }

        public void setGridLength(int gridLength) {
            this.gridLength = gridLength;
        }

        public int getGridHeight() {
            return gridHeight;
        }

        public void setGridHeight(int gridHeight) {
            this.gridHeight = gridHeight;
        }

}
