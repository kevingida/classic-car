import React from "react";
import Link from "next/link";
import Image from "next/image";
import history from "../style/history.module.css";

const History = ({ heading1, heading2, message }) => {
  return (
    <div className={history.container}>
      <div className={history.content}>
        <div className={history.title}>
          <p>{heading1}</p>
          <p>{heading2}</p>
        </div>
        <div className={history.message}>
          <p>{message}</p>
        </div>
        <Link className={history.button} href="/ABOPUT">
          MORE ABOUT US
        </Link>
        <Image
          src="/image1.png"
          alt="classic car"
          width={600}
          height={400}
          className={history.image}
        />
      </div>
    </div>
  );
};

export default History;
