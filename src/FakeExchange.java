public class FakeExchange implements Exchange {

  @Override
  public float rate(String origin, String target) {
    if (origin.equals("USD") && target.equals("Euro")) {
      return 0.85f; // Example rate for USD to Euro conversion
    }
    return 1.0f; // Default rate for unsupported conversions
  }
}
