package day1.entity;

public class Customer {
		private int cid;
		private String cname;
		private String city;
		private int cphone;
		
		public int getcid() {
			return cid;
		}
		public void setcid(int cid) {
			this.cid = cid;
		}
		
		
		public String getcname() {
			return cname;
		}
		public void setcname(String cname) {
			this.cname = cname;
		}
		
		
		public String getcity() {
			return city;
		}
		public void setcity(String city) {
			this.city = city;
		}
		
		public int getcphone() {
			return cphone;
		}
		public void setcphone(int cphone) {
			this.cphone=cphone;
		}
		
		public String toString() {
			return "Customer [Customer id=" + cid +" ,Customer name="+ cname+", City=" +city+",Customer phone="+cphone;
		}

}
