package model;

/**
 *
 * @author Michael Farmer
 */

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class OutsourcedParts extends Parts {

    private final StringProperty outsourcedCompanyName;

    public OutsourcedParts(){
        super();
        outsourcedCompanyName = new SimpleStringProperty();
    }

    public String getOutsourceCompanyName(){
        return this.outsourcedCompanyName.get();
    }

    public void setOutsourceCompanyName(String outsourcedCompanyName){
        this.outsourcedCompanyName.set(outsourcedCompanyName);
    }
}
