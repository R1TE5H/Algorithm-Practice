function fibonacci(iterations) {
  if (typeof iterations !== "number" || iterations <= 0)
    throw new Error("Iterations should be a positive number");

  const sequence = [];
  let n1 = 0;
  let n2 = 1;

  for (let i = 0; i < iterations; i++) {
    if (i === 0) {
      sequence.push(n1);
    } else if (i === 1) {
      sequence.push(n2);
    } else {
      const nextTerm = n1 + n2;
      sequence.push(nextTerm);
      n1 = n2;
      n2 = nextTerm;
    }
  }
  return sequence;
}

try {
  const result = fibonacci(6);
  console.log(result);
} catch (e) {
  console.error(e);
}
