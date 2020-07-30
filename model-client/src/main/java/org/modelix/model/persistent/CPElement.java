package org.modelix.model.persistent;

public abstract class CPElement {

  public static CPElement deserialize(String input) {
    return CPNode.deserialize(input);
  }

  protected final long id;
  protected final long parentId;
  protected final String roleInParent;

  public CPElement(long id1, long parentId1, String roleInParent1) {
    id = id1;
    parentId = parentId1;
    roleInParent = roleInParent1;
  }

  public long getId() {
    return id;
  }

  public long getParentId() {
    return parentId;
  }

  public String getRoleInParent() {
    return roleInParent;
  }

  public abstract String serialize();

  public String getHash() {
    return HashUtil.sha256(serialize());
  }
}