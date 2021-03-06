package ac.za.cput.domains.table;

import java.util.Objects;

public class Table {

    private String tableID;
    private int capacity;
    private boolean isavailable;

private Table(){}

    private Table(Builder builder)
    {
        this.tableID = tableID;
        this.capacity = capacity;
        this.isavailable = isavailable;
    }

    public String getTableID() {
        return tableID;
    }

    public int getCapacity() {
        return capacity;
    }

    public boolean isIsavailable() {
        return isavailable;
    }

    public static class Builder
    {
        private String tableID;
        private int capacity;
        private boolean isavailable;

        public Builder tableID(String tableID)
        {
            this.tableID=tableID;
            return this;

        }

    public Builder capacity(int capacity)
        {
            this.capacity=capacity;
            return this;

        }

        public Builder isavailable(boolean isavailable)
        {
            this.isavailable =isavailable;
            return this;

        }

        public Table build()
        {
            return new Table(this);
        }

    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Table)) return false;
        Table table = (Table) o;
        return Objects.equals(getTableID(), table.getTableID());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getTableID());
    }
}
