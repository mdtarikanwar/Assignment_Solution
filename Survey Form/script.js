const form = document.getElementById("surveyForm");
const modal = document.getElementById("popupModal");
const modalData = document.getElementById("modalData");
const closeModal = document.getElementById("closeModal");

form.addEventListener("submit", function (event) {
  event.preventDefault(); // Prevent form submission

  // Gather all form data
  const firstName = document.getElementById("firstName").value;
  const lastName = document.getElementById("lastName").value;
  const dob = document.getElementById("dob").value;
  const country = document.getElementById("country").value;
  const gender = document.querySelector('input[name="gender"]:checked').value;
  const profession = document.getElementById("profession").value;
  const email = document.getElementById("email").value;
  const mobile = document.getElementById("mobile").value;

  // Create the popup content
  modalData.innerHTML = `
        <p><strong>First Name:</strong> ${firstName}</p>
        <p><strong>Last Name:</strong> ${lastName}</p>
        <p><strong>Date of Birth:</strong> ${dob}</p>
        <p><strong>Country:</strong> ${country}</p>
        <p><strong>Gender:</strong> ${gender}</p>
        <p><strong>Profession:</strong> ${profession}</p>
        <p><strong>Email:</strong> ${email}</p>
        <p><strong>Mobile Number:</strong> ${mobile}</p>
      `;

  // Show the modal
  modal.style.display = "flex";
});

// Close modal and reset form
closeModal.addEventListener("click", function () {
  modal.style.display = "none";
  form.reset();
});
