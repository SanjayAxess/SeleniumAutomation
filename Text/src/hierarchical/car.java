package hierarchical;

public class car implements Engine {

	@Override
	public void Start() {
		System.out.println("Engine Start with key....");
	}

	@Override
	public void Stop() {
		System.out.println("Engine Stop with Break....");
	}

		public static void main(String[] args) {
			car dr= new car();
			dr.Start();
			dr.Stop();
		}
	}


