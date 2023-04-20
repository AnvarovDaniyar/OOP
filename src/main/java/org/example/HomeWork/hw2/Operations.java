package org.example.HomeWork.hw2;

import java.util.List;
import java.util.Map;
import java.util.Set;

public interface Operations {
    public void printList();
    public boolean notebookIsCorrect(Laptops notebook);
    public int getCriteria();
    public String getPropertyDescription(String property);
    public Map<String, String> descriptionsProperties();
    public List<String> propertiesForFilter();
    public String getOperations();
    public Set<String> quantitativeSelection();
}
