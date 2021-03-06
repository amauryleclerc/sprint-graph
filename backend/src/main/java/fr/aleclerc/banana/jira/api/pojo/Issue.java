package fr.aleclerc.banana.jira.api.pojo;

public class Issue {
	private String expand;
	private String id;
	private String self;
	private String key;
	private Fields fields;
	private Changelog changelog;

	public String getExpand() {
		return expand;
	}
	public void setExpand(String expand) {
		this.expand = expand;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getSelf() {
		return self;
	}
	public void setSelf(String self) {
		this.self = self;
	}
	public String getKey() {
		return key;
	}
	public void setKey(String key) {
		this.key = key;
	}
	public Fields getFields() {
		return fields;
	}
	public void setFields(Fields fields) {
		this.fields = fields;
	}

	public Changelog getChangelog() {
		return changelog;
	}

	public void setChangelog(Changelog changelog) {
		this.changelog = changelog;
	}

	@Override
	public String toString() {
		return "Issue [expand=" + expand + ", id=" + id + ", self=" + self + ", key=" + key + ", fields=" + fields
				+ "]";
	}
	
	
	
	

}
